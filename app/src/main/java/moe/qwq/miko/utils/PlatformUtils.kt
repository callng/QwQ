package moe.qwq.miko.utils

import android.annotation.SuppressLint
import android.app.ActivityManager
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.pm.PackageInfo
import android.os.Process
import android.provider.Settings
import moe.fuqiuluo.xposed.loader.LuoClassloader
import moe.qwq.miko.ext.toast
import mqq.app.MobileQQ
import kotlin.random.Random

internal object PlatformTools {
    const val QQ_9_0_8_VER = 5540
    const val QQ_9_0_15_VER = 5626
    const val QQ_9_0_65_VER = 6566
    const val QQ_9_0_70_VER = 6700

    fun isQQnt(): Boolean {
        return try {
            LuoClassloader.load("com.tencent.qqnt.base.BaseActivity") != null
        } catch (e: Exception) {
            false
        }
    }

    fun getQUA(): String {
        return "V1_AND_SQ_${getQQVersion(MobileQQ.getContext())}_${getQQVersionCode()}_YYB_D"
    }

    fun getQQVersion(context: Context): String {
        val packageInfo: PackageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
        return packageInfo.versionName
    }

    fun getQQVersionCode(context: Context = MobileQQ.getContext()): Int {
        val packageInfo: PackageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
        return packageInfo.versionCode
    }

    /**
     * 获取OIDB包的ClientVersion信息
     */
    fun getClientVersion(context: Context): String = "android ${getQQVersion(context)}"

    /**
     * 是否处于QQ MSF协议进程
     */
    fun isMsfProcess(): Boolean {
        return MobileQQ.getMobileQQ().qqProcessName.contains("msf", ignoreCase = true)
    }

    /**
     * 是否处于QQ主进程
     */
    fun isMainProcess(): Boolean {
        return isMqq() || isTim()
    }

    fun isMqq(): Boolean {
        return MobileQQ.getMobileQQ().qqProcessName == "com.tencent.mobileqq"
    }

    fun isMqqPackage(): Boolean {
        return MobileQQ.getMobileQQ().qqProcessName.startsWith("com.tencent.mobileqq")
    }

    fun isTim(): Boolean {
        return MobileQQ.getMobileQQ().qqProcessName == "com.tencent.tim"
    }

    fun killProcess(context: Context, processName: String) {
        for (processInfo in (context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager).runningAppProcesses) {
            if (processInfo.processName == processName) {
                Process.killProcess(processInfo.pid)
            }
        }
    }

    @SuppressLint("HardwareIds")
    fun getAndroidID(): String {
        var androidId =
            Settings.Secure.getString(MobileQQ.getContext().contentResolver, "android_id")
        if (androidId == null) {
            val sb = StringBuilder()
            for (i in 0..15) {
                sb.append(Random.nextInt(10))
            }
            androidId = sb.toString()
        }
        return androidId
    }

    // 复制到剪切板
    fun copyToClipboard(context: Context = MobileQQ.getContext(), text: String) {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("label", text)
        clipboard.setPrimaryClip(clip)
        context.toast("已复制到剪切板")
    }
}