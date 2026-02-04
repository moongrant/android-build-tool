package com.ff14.macro;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 扫描 MuMu 模拟器本地的 .mmor 操作录制文件
 */
public class MmorScanner {

    private static final String TAG = "MmorScanner";

    /**
     * MuMu 模拟器可能存储 .mmor 文件的路径
     */
    private static final String[] MUMU_PATHS = {
        // MuMu 12 操作录制目录
        "/data/data/com.mumu.store/files/macro",
        "/data/data/com.mumu.store/files/record",
        "/data/data/com.mumu.store/files/optscr",
        "/data/user/0/com.mumu.store/files/macro",

        // MuMu 共享存储
        "/sdcard/MuMu",
        "/sdcard/MuMu/macro",
        "/sdcard/MuMu/record",
        "/sdcard/MuMu/optscr",
        "/sdcard/MuMuSharedFolder",

        // Android/data 下的 MuMu 目录
        "/sdcard/Android/data/com.mumu.store/files",
        "/sdcard/Android/data/com.mumu.store/files/macro",
        "/sdcard/Android/data/com.mumu.cantelope/files",

        // MuMu 模拟器内部存储（模拟器内运行时）
        "/data/local/tmp",
        "/data/local/tmp/macro",

        // 通用路径
        "/sdcard/Download",
        "/sdcard/Downloads",
        "/sdcard/Documents",

        // MuMu 6/X 旧版路径
        "/sdcard/Android/data/com.netease.mumu.cloner/files",
    };

    /**
     * 扫描结果
     */
    public static class ScanResult {
        public File file;
        public String name;
        public long size;
        public long lastModified;

        public ScanResult(File file) {
            this.file = file;
            this.name = file.getName();
            this.size = file.length();
            this.lastModified = file.lastModified();
        }

        public String getDisplayName() {
            // 移除 .mmor 后缀
            if (name.toLowerCase().endsWith(".mmor")) {
                return name.substring(0, name.length() - 5);
            }
            return name;
        }

        public String getSizeString() {
            if (size < 1024) {
                return size + " B";
            } else if (size < 1024 * 1024) {
                return String.format("%.1f KB", size / 1024.0);
            } else {
                return String.format("%.1f MB", size / (1024.0 * 1024.0));
            }
        }
    }

    /**
     * 扫描所有可能的路径查找 .mmor 文件
     */
    public static List<ScanResult> scanMmorFiles(Context context) {
        List<ScanResult> results = new ArrayList<>();

        // 扫描预定义路径
        for (String path : MUMU_PATHS) {
            scanDirectory(new File(path), results);
        }

        // 扫描外部存储根目录（不递归太深）
        File externalStorage = Environment.getExternalStorageDirectory();
        if (externalStorage != null && externalStorage.exists()) {
            // 只扫描根目录下的 .mmor 文件
            scanDirectoryShallow(externalStorage, results, 2);
        }

        // 扫描应用私有目录
        File appFilesDir = context.getFilesDir();
        if (appFilesDir != null) {
            scanDirectory(appFilesDir, results);
        }

        File appExternalDir = context.getExternalFilesDir(null);
        if (appExternalDir != null) {
            scanDirectory(appExternalDir, results);
        }

        Log.d(TAG, "扫描完成，找到 " + results.size() + " 个 .mmor 文件");
        return results;
    }

    /**
     * 扫描目录（递归）
     */
    private static void scanDirectory(File dir, List<ScanResult> results) {
        if (dir == null || !dir.exists() || !dir.isDirectory()) {
            return;
        }

        try {
            File[] files = dir.listFiles();
            if (files == null) return;

            for (File file : files) {
                if (file.isFile() && file.getName().toLowerCase().endsWith(".mmor")) {
                    // 检查是否已存在（避免重复）
                    boolean exists = false;
                    for (ScanResult r : results) {
                        if (r.file.getAbsolutePath().equals(file.getAbsolutePath())) {
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        results.add(new ScanResult(file));
                        Log.d(TAG, "找到: " + file.getAbsolutePath());
                    }
                } else if (file.isDirectory()) {
                    // 递归扫描子目录
                    scanDirectory(file, results);
                }
            }
        } catch (SecurityException e) {
            Log.w(TAG, "无权限访问: " + dir.getAbsolutePath());
        }
    }

    /**
     * 浅层扫描目录（限制深度）
     */
    private static void scanDirectoryShallow(File dir, List<ScanResult> results, int maxDepth) {
        if (dir == null || !dir.exists() || !dir.isDirectory() || maxDepth <= 0) {
            return;
        }

        try {
            File[] files = dir.listFiles();
            if (files == null) return;

            for (File file : files) {
                if (file.isFile() && file.getName().toLowerCase().endsWith(".mmor")) {
                    boolean exists = false;
                    for (ScanResult r : results) {
                        if (r.file.getAbsolutePath().equals(file.getAbsolutePath())) {
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        results.add(new ScanResult(file));
                        Log.d(TAG, "找到: " + file.getAbsolutePath());
                    }
                } else if (file.isDirectory() && maxDepth > 1) {
                    scanDirectoryShallow(file, results, maxDepth - 1);
                }
            }
        } catch (SecurityException e) {
            Log.w(TAG, "无权限访问: " + dir.getAbsolutePath());
        }
    }

    /**
     * 获取所有扫描过的路径（用于调试/显示）
     */
    public static List<String> getScannedPaths() {
        List<String> paths = new ArrayList<>();
        for (String path : MUMU_PATHS) {
            File dir = new File(path);
            paths.add(path + (dir.exists() ? " ✓" : " ✗"));
        }
        return paths;
    }
}
