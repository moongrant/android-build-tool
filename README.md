# Android Build Tool

一个 Android 云端构建模板仓库。将任意 Android 项目放入，push 后自动在 GitHub Actions 上构建 Debug APK。

## 特点

- 100% 云端构建，无需本地安装 Android Studio / SDK / JDK
- 自动缓存 Gradle 依赖，加速后续构建
- 构建产物以 Artifact 形式提供下载

## 使用方法

### 方式一：使用模板创建新仓库

1. 点击本仓库页面右上角的 **Use this template** → **Create a new repository**
2. 填写新仓库名称，点击创建
3. Clone 新仓库到本地
4. 将你的 Android 项目文件复制进来（替换 demo 文件）
5. `git add . && git commit -m "Add my project" && git push`

### 方式二：直接 Fork

1. Fork 本仓库
2. 将你的 Android 项目文件替换进来
3. Push 触发构建

### 方式三：复制 workflow 到现有项目

将 `.github/workflows/android-build.yml` 复制到你的 Android 项目中即可。

## 下载 APK

1. 进入 GitHub 仓库页面
2. 点击 **Actions** 标签
3. 选择 **Android Build** workflow
4. 点击最新一次成功的 run
5. 页面底部 **Artifacts** 区域，点击 **app-debug-apk** 下载

## 项目要求

你的 Android 项目必须包含：

- `gradlew` - Gradle Wrapper 脚本
- `gradle/wrapper/` - Wrapper 配置
- `settings.gradle` 或 `settings.gradle.kts`
- `app/build.gradle` 或 `app/build.gradle.kts`

## 自定义

如需构建 Release APK，修改 workflow 中的构建命令：

```yaml
- name: Build Release APK
  run: ./gradlew --no-daemon assembleRelease
```

并相应修改 APK 查找路径。
