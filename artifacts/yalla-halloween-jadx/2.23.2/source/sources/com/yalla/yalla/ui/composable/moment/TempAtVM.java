package com.yalla.yalla.ui.composable.moment;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.data.db.table.UserInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394o0Oo0.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fR/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/composable/moment/TempAtVM;", "Lo0Oo0/OooOO0;", "Lcom/yalla/yalla/data/db/table/UserInfo;", "<set-?>", "tempAtUser$delegate", "Landroidx/compose/runtime/MutableState;", "getTempAtUser", "()Lcom/yalla/yalla/data/db/table/UserInfo;", "setTempAtUser", "(Lcom/yalla/yalla/data/db/table/UserInfo;)V", "tempAtUser", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentInputFacePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentInputFacePanel.kt\ncom/yalla/yalla/ui/composable/moment/TempAtVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,207:1\n81#2:208\n107#2,2:209\n*S KotlinDebug\n*F\n+ 1 MomentInputFacePanel.kt\ncom/yalla/yalla/ui/composable/moment/TempAtVM\n*L\n46#1:208\n46#1:209,2\n*E\n"})
public final class TempAtVM extends OooOO0 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: tempAtUser$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState tempAtUser = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final UserInfo getTempAtUser() {
        return (UserInfo) this.tempAtUser.getValue();
    }

    public final void setTempAtUser(@Nullable UserInfo userInfo) {
        this.tempAtUser.setValue(userInfo);
    }
}
