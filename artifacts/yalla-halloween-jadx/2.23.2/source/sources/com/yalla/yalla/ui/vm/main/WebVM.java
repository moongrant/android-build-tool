package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p394o0Oo0.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR+\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR+\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR+\u0010!\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR+\u0010#\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0005\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR+\u0010(\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0005\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR+\u0010,\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0005\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR+\u00100\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0005\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\tR+\u00104\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0005\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\t¨\u00067"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/WebVM;", "Lo0Oo0/OooOO0;", "", "<set-?>", "statusBarBlackIcon$delegate", "Landroidx/compose/runtime/MutableState;", "getStatusBarBlackIcon", "()Z", "setStatusBarBlackIcon", "(Z)V", "statusBarBlackIcon", "showToolbar$delegate", "getShowToolbar", "setShowToolbar", "showToolbar", "", "toolbarTitle$delegate", "getToolbarTitle", "()Ljava/lang/String;", "setToolbarTitle", "(Ljava/lang/String;)V", "toolbarTitle", "toolbarGreenStyle$delegate", "getToolbarGreenStyle", "setToolbarGreenStyle", "toolbarGreenStyle", "backIconIsClose$delegate", "getBackIconIsClose", "setBackIconIsClose", "backIconIsClose", "showCloseAdIcon$delegate", "getShowCloseAdIcon", "setShowCloseAdIcon", "showCloseAdIcon", "isLoadError$delegate", "isLoadError", "setLoadError", "showDropdownMenu$delegate", "getShowDropdownMenu", "setShowDropdownMenu", "showDropdownMenu", "showMenuShare$delegate", "getShowMenuShare", "setShowMenuShare", "showMenuShare", "showMenuRefresh$delegate", "getShowMenuRefresh", "setShowMenuRefresh", "showMenuRefresh", "showMenuOpenInBrowser$delegate", "getShowMenuOpenInBrowser", "setShowMenuOpenInBrowser", "showMenuOpenInBrowser", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWebVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebVM.kt\ncom/yalla/yalla/ui/vm/main/WebVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,23:1\n81#2:24\n107#2,2:25\n81#2:27\n107#2,2:28\n81#2:30\n107#2,2:31\n81#2:33\n107#2,2:34\n81#2:36\n107#2,2:37\n81#2:39\n107#2,2:40\n81#2:42\n107#2,2:43\n81#2:45\n107#2,2:46\n81#2:48\n107#2,2:49\n81#2:51\n107#2,2:52\n81#2:54\n107#2,2:55\n*S KotlinDebug\n*F\n+ 1 WebVM.kt\ncom/yalla/yalla/ui/vm/main/WebVM\n*L\n10#1:24\n10#1:25,2\n11#1:27\n11#1:28,2\n12#1:30\n12#1:31,2\n13#1:33\n13#1:34,2\n14#1:36\n14#1:37,2\n15#1:39\n15#1:40,2\n16#1:42\n16#1:43,2\n18#1:45\n18#1:46,2\n19#1:48\n19#1:49,2\n20#1:51\n20#1:52,2\n21#1:54\n21#1:55,2\n*E\n"})
public final class WebVM extends OooOO0 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: backIconIsClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState backIconIsClose;

    /* JADX INFO: renamed from: isLoadError$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isLoadError;

    /* JADX INFO: renamed from: showCloseAdIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showCloseAdIcon;

    /* JADX INFO: renamed from: showDropdownMenu$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showDropdownMenu;

    /* JADX INFO: renamed from: showMenuOpenInBrowser$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showMenuOpenInBrowser;

    /* JADX INFO: renamed from: showMenuRefresh$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showMenuRefresh;

    /* JADX INFO: renamed from: showMenuShare$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showMenuShare;

    /* JADX INFO: renamed from: showToolbar$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showToolbar;

    /* JADX INFO: renamed from: statusBarBlackIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState statusBarBlackIcon;

    /* JADX INFO: renamed from: toolbarGreenStyle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState toolbarGreenStyle;

    /* JADX INFO: renamed from: toolbarTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState toolbarTitle;

    public WebVM() {
        Boolean bool = Boolean.TRUE;
        this.statusBarBlackIcon = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showToolbar = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.toolbarTitle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        Boolean bool2 = Boolean.FALSE;
        this.toolbarGreenStyle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.backIconIsClose = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.showCloseAdIcon = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.isLoadError = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.showDropdownMenu = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.showMenuShare = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.showMenuRefresh = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.showMenuOpenInBrowser = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getBackIconIsClose() {
        return ((Boolean) this.backIconIsClose.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCloseAdIcon() {
        return ((Boolean) this.showCloseAdIcon.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowDropdownMenu() {
        return ((Boolean) this.showDropdownMenu.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowMenuOpenInBrowser() {
        return ((Boolean) this.showMenuOpenInBrowser.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowMenuRefresh() {
        return ((Boolean) this.showMenuRefresh.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowMenuShare() {
        return ((Boolean) this.showMenuShare.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowToolbar() {
        return ((Boolean) this.showToolbar.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getStatusBarBlackIcon() {
        return ((Boolean) this.statusBarBlackIcon.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getToolbarGreenStyle() {
        return ((Boolean) this.toolbarGreenStyle.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getToolbarTitle() {
        return (String) this.toolbarTitle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isLoadError() {
        return ((Boolean) this.isLoadError.getValue()).booleanValue();
    }

    public final void setBackIconIsClose(boolean z) {
        this.backIconIsClose.setValue(Boolean.valueOf(z));
    }

    public final void setLoadError(boolean z) {
        this.isLoadError.setValue(Boolean.valueOf(z));
    }

    public final void setShowCloseAdIcon(boolean z) {
        this.showCloseAdIcon.setValue(Boolean.valueOf(z));
    }

    public final void setShowDropdownMenu(boolean z) {
        this.showDropdownMenu.setValue(Boolean.valueOf(z));
    }

    public final void setShowMenuOpenInBrowser(boolean z) {
        this.showMenuOpenInBrowser.setValue(Boolean.valueOf(z));
    }

    public final void setShowMenuRefresh(boolean z) {
        this.showMenuRefresh.setValue(Boolean.valueOf(z));
    }

    public final void setShowMenuShare(boolean z) {
        this.showMenuShare.setValue(Boolean.valueOf(z));
    }

    public final void setShowToolbar(boolean z) {
        this.showToolbar.setValue(Boolean.valueOf(z));
    }

    public final void setStatusBarBlackIcon(boolean z) {
        this.statusBarBlackIcon.setValue(Boolean.valueOf(z));
    }

    public final void setToolbarGreenStyle(boolean z) {
        this.toolbarGreenStyle.setValue(Boolean.valueOf(z));
    }

    public final void setToolbarTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.toolbarTitle.setValue(str);
    }
}
