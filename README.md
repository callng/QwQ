<div align="center">

![][banner]

[![][actions]][actions-link]
[![][releases]][releases-link]
[![][downloads]][releases-link]

[![][license]](LICENSE)

</div>

## 简介

QwQ 是基于 LSPosed 实现的类似于QAuxiliary的通用性QQ增强LSPosed模块。

> 本项目仅提供学习与交流用途，请在24小时内删除。   
> 本项目目的是研究 LSPosed 框架的使用。 Epic 框架开发相关知识。  
> 如有违反法律，请联系删除。
> 请勿在任何平台宣传，宣扬，转发本项目，请勿恶意修改企业安装包造成相关企业产生损失，如有违背，必将追责到底。
> 
> 本项目在多处拥有唯一的特征，如若今后在任何闭源模块发现，将会给予警告及公示！
> 本项目代码仅提供学习与交流，不提供私有化，闭源分发！
> 
> [Discord社区](https://discord.gg/MKR2wz863h)

## 兼容说明

- 安卓版本 >= 8.1
- QQ版本 >= 8.x

## 使用方法

> 访问 ``qwq.dev`` 或者 ``qwq.qq.com`` 即可进入设置界面
> 设置界面采用的是 **element-plus** + **vue** 实现
> 您可以通过编辑``/storage/emulated/0/Android/data/com.tencent.mobileqq/Tencent/QwQ/domain``中的域名，将设置界面定义到您的自定义美化设置界面站点，通过QwQ开放的Js桥接口，实现您需要的功能。
> [qwq-web-setting](https://github.com/KarinJS/qwq-web-setting)

## 提供的功能

- 基于协议实现的反撤回（通用Hook，无需每个版本都更新一次模块）
- 提供消息加密功能（非对应密钥的消息不解密只显示一个表情包）

## 权限声明

> 如出现未在此处声明的权限，请警惕 QwQ 是否被修改/植入恶意代码

## 开源协议

本项目使用 [GPL-3.0](LICENSE) 协议开放源代码

```text
QwQ - LSPosed Module for QQ
Copyright (C) 2023 QwQ Team
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
```

## 感谢以下项目

- [QAuxiliary](https://github.com/cinit/QAuxiliary): Plagiarism of the project code
- [LSPosed](https://github.com/LSPosed/LSPosed): Hook framework
- [vue](https://cn.vuejs.org/): Setting page framework
- [OpenShamrock](https://github.com/whitechi73/OpenShamrock): Protocol Hook

## 贡献者

[![][contrib-image]][contrib-link]

[banner]: https://socialify.git.ci/whitechi73/QwQ/image?description=1&forks=1&issues=1&logo=https://github.com/whitechi73/QwQ/assets/98259561/bf4ebdb6-da8d-4204-80aa-5db91e0c97ab&pattern=Plus&pulls=1&stargazers=1&theme=Auto

[actions]: https://img.shields.io/github/actions/workflow/status/whitechi73/QwQ/build-apk.yml?style=for-the-badge

[actions-link]: https://github.com/whitechi73/QwQ/actions/workflows/build-apk.yml

[releases]: https://img.shields.io/github/v/release/whitechi73/QwQ?style=for-the-badge

[releases-link]: https://github.com/whitechi73/QwQ/releases

[downloads]: https://img.shields.io/github/downloads/whitechi73/QwQ/total?style=for-the-badge

[license]: https://img.shields.io/github/license/whitechi73/QwQ?style=for-the-badge

[contrib-image]: https://contrib.rocks/image?repo=whitechi73/QwQ

[contrib-link]: https://github.com/whitechi73/QwQ/graphs/contributors