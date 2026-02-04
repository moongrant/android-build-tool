package com.ff14.macro;

import android.Manifest;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

/**
 * 主界面
 */
public class MainActivity extends AppCompatActivity implements MacroAdapter.OnMacroClickListener {

    private static final int REQUEST_OVERLAY_PERMISSION = 1001;
    private static final int REQUEST_STORAGE_PERMISSION = 1002;
    private static final int REQUEST_MANAGE_STORAGE = 1003;

    private TextView tvOverlayStatus;
    private TextView tvAccessibilityStatus;
    private TextView tvStorageStatus;
    private Button btnOverlayPermission;
    private Button btnAccessibilityPermission;
    private Button btnStoragePermission;
    private Button btnToggleFloating;
    private Button btnAddMacro;
    private Button btnImportMmor;
    private RecyclerView rvMacros;

    private MacroStorage macroStorage;
    private MacroAdapter adapter;
    private List<Macro> macros;
    private boolean isFloatingServiceRunning = false;

    // 文件选择器
    private ActivityResultLauncher<String[]> filePickerLauncher;

    private BroadcastReceiver accessibilityReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            updatePermissionStatus();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFilePicker();
        initViews();
        initData();
        setupListeners();
    }

    @Override
    protected void onResume() {
        super.onResume();
        updatePermissionStatus();
        loadMacros();

        IntentFilter filter = new IntentFilter("com.ff14.macro.ACCESSIBILITY_CONNECTED");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            registerReceiver(accessibilityReceiver, filter, Context.RECEIVER_NOT_EXPORTED);
        } else {
            registerReceiver(accessibilityReceiver, filter);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        try {
            unregisterReceiver(accessibilityReceiver);
        } catch (Exception ignored) {}
    }

    private void initFilePicker() {
        filePickerLauncher = registerForActivityResult(
            new ActivityResultContracts.OpenDocument(),
            uri -> {
                if (uri != null) {
                    importMmorFromUri(uri);
                }
            }
        );
    }

    private void initViews() {
        tvOverlayStatus = findViewById(R.id.tvOverlayStatus);
        tvAccessibilityStatus = findViewById(R.id.tvAccessibilityStatus);
        tvStorageStatus = findViewById(R.id.tvStorageStatus);
        btnOverlayPermission = findViewById(R.id.btnOverlayPermission);
        btnAccessibilityPermission = findViewById(R.id.btnAccessibilityPermission);
        btnStoragePermission = findViewById(R.id.btnStoragePermission);
        btnToggleFloating = findViewById(R.id.btnToggleFloating);
        btnAddMacro = findViewById(R.id.btnAddMacro);
        btnImportMmor = findViewById(R.id.btnImportMmor);
        rvMacros = findViewById(R.id.rvMacros);

        rvMacros.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        macroStorage = new MacroStorage(this);
        macros = macroStorage.loadMacros();
        adapter = new MacroAdapter(macros, macroStorage.getSelectedMacroId());
        adapter.setOnMacroClickListener(this);
        rvMacros.setAdapter(adapter);
    }

    private void setupListeners() {
        btnOverlayPermission.setOnClickListener(v -> requestOverlayPermission());
        btnAccessibilityPermission.setOnClickListener(v -> openAccessibilitySettings());
        btnStoragePermission.setOnClickListener(v -> requestStoragePermission());
        btnToggleFloating.setOnClickListener(v -> toggleFloatingService());
        btnAddMacro.setOnClickListener(v -> showAddMacroDialog(null));
        btnImportMmor.setOnClickListener(v -> showImportDialog());
    }

    private void updatePermissionStatus() {
        // 检查悬浮窗权限
        boolean hasOverlay = Settings.canDrawOverlays(this);
        tvOverlayStatus.setText("悬浮窗权限: " + (hasOverlay ? "已授予" : "未授予"));
        btnOverlayPermission.setVisibility(hasOverlay ? View.GONE : View.VISIBLE);

        // 检查无障碍服务
        boolean hasAccessibility = isAccessibilityServiceEnabled();
        tvAccessibilityStatus.setText("无障碍服务: " + (hasAccessibility ? "已开启" : "未开启"));
        btnAccessibilityPermission.setVisibility(hasAccessibility ? View.GONE : View.VISIBLE);

        // 检查存储权限
        boolean hasStorage = hasStoragePermission();
        tvStorageStatus.setText("存储权限: " + (hasStorage ? "已授予" : "未授予"));
        btnStoragePermission.setVisibility(hasStorage ? View.GONE : View.VISIBLE);

        // 更新启动按钮状态
        boolean canStart = hasOverlay && hasAccessibility;
        btnToggleFloating.setEnabled(canStart);
        btnToggleFloating.setAlpha(canStart ? 1.0f : 0.5f);
    }

    private boolean hasStoragePermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            return Environment.isExternalStorageManager();
        } else {
            return ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                == PackageManager.PERMISSION_GRANTED;
        }
    }

    private void requestStoragePermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            try {
                Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
                intent.setData(Uri.parse("package:" + getPackageName()));
                startActivityForResult(intent, REQUEST_MANAGE_STORAGE);
            } catch (Exception e) {
                Intent intent = new Intent(Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION);
                startActivityForResult(intent, REQUEST_MANAGE_STORAGE);
            }
        } else {
            ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                REQUEST_STORAGE_PERMISSION);
        }
    }

    private boolean isAccessibilityServiceEnabled() {
        AccessibilityManager am = (AccessibilityManager) getSystemService(Context.ACCESSIBILITY_SERVICE);
        List<AccessibilityServiceInfo> enabledServices = am.getEnabledAccessibilityServiceList(
            AccessibilityServiceInfo.FEEDBACK_ALL_MASK
        );

        for (AccessibilityServiceInfo info : enabledServices) {
            if (info.getId().contains(getPackageName())) {
                return true;
            }
        }
        return false;
    }

    private void requestOverlayPermission() {
        Intent intent = new Intent(
            Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
            Uri.parse("package:" + getPackageName())
        );
        startActivityForResult(intent, REQUEST_OVERLAY_PERMISSION);
    }

    private void openAccessibilitySettings() {
        Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
        startActivity(intent);
        Toast.makeText(this, "请找到 \"FF14 宏指令\" 并开启", Toast.LENGTH_LONG).show();
    }

    private void toggleFloatingService() {
        Intent serviceIntent = new Intent(this, FloatingButtonService.class);

        if (isFloatingServiceRunning) {
            stopService(serviceIntent);
            isFloatingServiceRunning = false;
            btnToggleFloating.setText("启动悬浮按钮");
        } else {
            if (macroStorage.getSelectedMacro() == null) {
                Toast.makeText(this, "请先选择一个宏指令", Toast.LENGTH_SHORT).show();
                return;
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                startForegroundService(serviceIntent);
            } else {
                startService(serviceIntent);
            }
            isFloatingServiceRunning = true;
            btnToggleFloating.setText("关闭悬浮按钮");
        }
    }

    private void loadMacros() {
        macros = macroStorage.loadMacros();
        adapter.setMacros(macros);
        adapter.setSelectedId(macroStorage.getSelectedMacroId());
    }

    /**
     * 显示导入选项对话框
     */
    private void showImportDialog() {
        String[] options = {
            "扫描 MuMu 本地文件（推荐）",
            "从文件选择器导入",
            "手动输入路径"
        };

        new AlertDialog.Builder(this)
            .setTitle("导入 MuMu 操作录制")
            .setItems(options, (dialog, which) -> {
                switch (which) {
                    case 0:
                        scanMumuFiles();
                        break;
                    case 1:
                        filePickerLauncher.launch(new String[]{"*/*"});
                        break;
                    case 2:
                        showPathInputDialog();
                        break;
                }
            })
            .show();
    }

    /**
     * 扫描 MuMu 本地 .mmor 文件
     */
    private void scanMumuFiles() {
        if (!hasStoragePermission()) {
            Toast.makeText(this, "请先授予存储权限", Toast.LENGTH_SHORT).show();
            requestStoragePermission();
            return;
        }

        Toast.makeText(this, "正在扫描...", Toast.LENGTH_SHORT).show();

        new Thread(() -> {
            List<MmorScanner.ScanResult> results = MmorScanner.scanMmorFiles(this);

            runOnUiThread(() -> {
                if (results.isEmpty()) {
                    showNoFilesFoundDialog();
                } else {
                    showScanResultsDialog(results);
                }
            });
        }).start();
    }

    /**
     * 显示扫描结果对话框
     */
    private void showScanResultsDialog(List<MmorScanner.ScanResult> results) {
        String[] items = new String[results.size()];
        for (int i = 0; i < results.size(); i++) {
            MmorScanner.ScanResult r = results.get(i);
            items[i] = r.getDisplayName() + " (" + r.getSizeString() + ")";
        }

        new AlertDialog.Builder(this)
            .setTitle("找到 " + results.size() + " 个文件")
            .setItems(items, (dialog, which) -> {
                importMmorFromFile(results.get(which).file);
            })
            .setNegativeButton("取消", null)
            .show();
    }

    /**
     * 显示未找到文件对话框
     */
    private void showNoFilesFoundDialog() {
        String message = "未找到 .mmor 文件\n\n" +
            "请确保：\n" +
            "1. 已在 MuMu 操作录制中导入分享码\n" +
            "2. 或将 .mmor 文件放入以下目录：\n" +
            "   • /sdcard/Download/\n" +
            "   • /sdcard/MuMu/\n\n" +
            "提示：也可以使用「从文件选择器导入」";

        new AlertDialog.Builder(this)
            .setTitle("未找到文件")
            .setMessage(message)
            .setPositiveButton("从文件选择", (d, w) -> {
                filePickerLauncher.launch(new String[]{"*/*"});
            })
            .setNegativeButton("取消", null)
            .show();
    }

    /**
     * 显示路径输入对话框
     */
    private void showPathInputDialog() {
        EditText input = new EditText(this);
        input.setHint("/sdcard/Download/xxx.mmor");
        input.setSingleLine(true);

        new AlertDialog.Builder(this)
            .setTitle("输入 .mmor 文件路径")
            .setView(input)
            .setPositiveButton("导入", (dialog, which) -> {
                String path = input.getText().toString().trim();
                if (!path.isEmpty()) {
                    File file = new File(path);
                    if (file.exists()) {
                        importMmorFromFile(file);
                    } else {
                        Toast.makeText(this, "文件不存在", Toast.LENGTH_SHORT).show();
                    }
                }
            })
            .setNegativeButton("取消", null)
            .show();
    }

    /**
     * 从 File 导入 .mmor 文件
     */
    private void importMmorFromFile(File file) {
        Uri uri = Uri.fromFile(file);
        MmorParser.ParseResult result = MmorParser.parse(this, uri);

        if (result.success) {
            String defaultName = file.getName();
            if (defaultName.toLowerCase().endsWith(".mmor")) {
                defaultName = defaultName.substring(0, defaultName.length() - 5);
            }

            Macro macro = new Macro(result.name != null ? result.name : defaultName);
            macro.setActions(result.actions);
            macroStorage.addMacro(macro);
            loadMacros();

            String info = "导入成功！\n" +
                "名称: " + macro.getName() + "\n" +
                "操作数: " + result.actions.size();
            if (result.resolution != null) {
                info += "\n分辨率: " + result.resolution;
            }

            new AlertDialog.Builder(this)
                .setTitle("导入成功")
                .setMessage(info)
                .setPositiveButton("确定", null)
                .show();
        } else {
            new AlertDialog.Builder(this)
                .setTitle("导入失败")
                .setMessage(result.errorMessage != null ? result.errorMessage : "无法解析文件")
                .setPositiveButton("确定", null)
                .show();
        }
    }

    /**
     * 从 Uri 导入 .mmor 文件
     */
    private void importMmorFromUri(Uri uri) {
        MmorParser.ParseResult result = MmorParser.parse(this, uri);

        if (result.success) {
            Macro macro = new Macro(result.name != null ? result.name : "导入的宏");
            macro.setActions(result.actions);
            macroStorage.addMacro(macro);
            loadMacros();

            String info = "导入成功！\n" +
                "名称: " + macro.getName() + "\n" +
                "操作数: " + result.actions.size();
            if (result.resolution != null) {
                info += "\n分辨率: " + result.resolution;
            }

            new AlertDialog.Builder(this)
                .setTitle("导入成功")
                .setMessage(info)
                .setPositiveButton("确定", null)
                .show();
        } else {
            new AlertDialog.Builder(this)
                .setTitle("导入失败")
                .setMessage(result.errorMessage != null ? result.errorMessage : "无法解析文件")
                .setPositiveButton("确定", null)
                .show();
        }
    }

    private void showAddMacroDialog(Macro editMacro) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(editMacro == null ? "添加宏指令" : "编辑宏指令");

        View dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_add_macro, null);
        EditText etName = dialogView.findViewById(R.id.etMacroName);
        EditText etCommands = dialogView.findViewById(R.id.etMacroCommands);

        if (editMacro != null) {
            etName.setText(editMacro.getName());
            etCommands.setText(editMacro.getCommandsString());
        }

        builder.setView(dialogView);

        builder.setPositiveButton("保存", (dialog, which) -> {
            String name = etName.getText().toString().trim();
            String commands = etCommands.getText().toString().trim();

            if (name.isEmpty()) {
                Toast.makeText(this, "请输入宏名称", Toast.LENGTH_SHORT).show();
                return;
            }

            if (commands.isEmpty()) {
                Toast.makeText(this, "请输入操作指令", Toast.LENGTH_SHORT).show();
                return;
            }

            if (editMacro != null) {
                editMacro.setName(name);
                editMacro.parseCommands(commands);
                macroStorage.updateMacro(editMacro);
            } else {
                Macro macro = new Macro(name);
                macro.parseCommands(commands);
                macroStorage.addMacro(macro);
            }

            loadMacros();
        });

        builder.setNegativeButton("取消", null);
        builder.show();
    }

    @Override
    public void onMacroClick(Macro macro) {
        macroStorage.setSelectedMacroId(macro.getId());
        adapter.setSelectedId(macro.getId());
        Toast.makeText(this, "已选择: " + macro.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onEditClick(Macro macro) {
        showAddMacroDialog(macro);
    }

    @Override
    public void onDeleteClick(Macro macro) {
        new AlertDialog.Builder(this)
            .setTitle("确认删除")
            .setMessage("确定要删除宏 \"" + macro.getName() + "\" 吗？")
            .setPositiveButton("删除", (dialog, which) -> {
                macroStorage.deleteMacro(macro.getId());
                if (macro.getId().equals(macroStorage.getSelectedMacroId())) {
                    macroStorage.setSelectedMacroId(null);
                }
                loadMacros();
            })
            .setNegativeButton("取消", null)
            .show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_OVERLAY_PERMISSION ||
            requestCode == REQUEST_MANAGE_STORAGE) {
            updatePermissionStatus();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_STORAGE_PERMISSION) {
            updatePermissionStatus();
        }
    }
}
