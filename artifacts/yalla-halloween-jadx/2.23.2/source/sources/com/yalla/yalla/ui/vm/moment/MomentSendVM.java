package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.moment.MomentPowerSelectModel;
import com.yalla.yalla.model.moment.MomentTypePower;
import com.yalla.yalla.util.location.LocationModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o000000;
import p597o0oo00OO.o00000O;
import p597o0oo00OO.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u0005\"\u0004\b\u001a\u0010\u0007R+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0010\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010#\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0010\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!¨\u0006+"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentSendVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "()V", "isInEdit", "", "()Z", "setInEdit", "(Z)V", "<set-?>", "Lcom/yalla/yalla/util/location/LocationModel;", "locationModel", "getLocationModel", "()Lcom/yalla/yalla/util/location/LocationModel;", "setLocationModel", "(Lcom/yalla/yalla/util/location/LocationModel;)V", "locationModel$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/yalla/yalla/model/moment/MomentPowerSelectModel;", "momentPowerSelectModel", "getMomentPowerSelectModel", "()Lcom/yalla/yalla/model/moment/MomentPowerSelectModel;", "setMomentPowerSelectModel", "(Lcom/yalla/yalla/model/moment/MomentPowerSelectModel;)V", "momentPowerSelectModel$delegate", "toolbarIsClickable", "getToolbarIsClickable", "setToolbarIsClickable", "toolbarIsClickable$delegate", "", "toolbarRightText", "getToolbarRightText", "()Ljava/lang/String;", "setToolbarRightText", "(Ljava/lang/String;)V", "toolbarRightText$delegate", "toolbarTitleText", "getToolbarTitleText", "setToolbarTitleText", "toolbarTitleText$delegate", "getLocation", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMomentSendVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentSendVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,36:1\n81#2:37\n107#2,2:38\n81#2:40\n107#2,2:41\n81#2:43\n107#2,2:44\n81#2:46\n107#2,2:47\n81#2:49\n107#2,2:50\n*S KotlinDebug\n*F\n+ 1 MomentSendVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentSendVM\n*L\n20#1:37\n20#1:38,2\n21#1:40\n21#1:41,2\n22#1:43\n22#1:44,2\n23#1:46\n23#1:47,2\n24#1:49\n24#1:50,2\n*E\n"})
public final class MomentSendVM extends BaseMomentDetailVM {
    public static final int $stable = 8;
    private boolean isInEdit;

    /* JADX INFO: renamed from: toolbarTitleText$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState toolbarTitleText = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(o000000.Post), null, 2, null);

    /* JADX INFO: renamed from: toolbarRightText$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState toolbarRightText = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(o000000.Btn_Post), null, 2, null);

    /* JADX INFO: renamed from: toolbarIsClickable$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState toolbarIsClickable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: momentPowerSelectModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState momentPowerSelectModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new MomentPowerSelectModel(MomentTypePower.Open.getValue()), null, 2, null);

    /* JADX INFO: renamed from: locationModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState locationModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new LocationModel(), null, 2, null);

    public static final class OooO00o extends Lambda implements Function1<LocationModel, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LocationModel locationModel) {
            LocationModel locationModel2 = locationModel;
            if (locationModel2 == null) {
                locationModel2 = new LocationModel();
                locationModel2.f32318OooO0o = false;
                locationModel2.f32319OooO0o0 = o0000.OooO0OO(o000000.Null_Location_Info);
            }
            MomentSendVM.this.setLocationModel(locationModel2);
            return Unit.INSTANCE;
        }
    }

    public final void getLocation(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        o00000OO o00000oo2 = new o00000OO(activity);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(o00000oo2.f57353OooO00o), Dispatchers.getIO(), null, new o00000O(o00000oo2, new OooO00o(), null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final LocationModel getLocationModel() {
        return (LocationModel) this.locationModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MomentPowerSelectModel getMomentPowerSelectModel() {
        return (MomentPowerSelectModel) this.momentPowerSelectModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getToolbarIsClickable() {
        return ((Boolean) this.toolbarIsClickable.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getToolbarRightText() {
        return (String) this.toolbarRightText.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getToolbarTitleText() {
        return (String) this.toolbarTitleText.getValue();
    }

    /* JADX INFO: renamed from: isInEdit, reason: from getter */
    public final boolean getIsInEdit() {
        return this.isInEdit;
    }

    public final void setInEdit(boolean z) {
        this.isInEdit = z;
    }

    public final void setLocationModel(@NotNull LocationModel locationModel) {
        Intrinsics.checkNotNullParameter(locationModel, "<set-?>");
        this.locationModel.setValue(locationModel);
    }

    public final void setMomentPowerSelectModel(@NotNull MomentPowerSelectModel momentPowerSelectModel) {
        Intrinsics.checkNotNullParameter(momentPowerSelectModel, "<set-?>");
        this.momentPowerSelectModel.setValue(momentPowerSelectModel);
    }

    public final void setToolbarIsClickable(boolean z) {
        this.toolbarIsClickable.setValue(Boolean.valueOf(z));
    }

    public final void setToolbarRightText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.toolbarRightText.setValue(str);
    }

    public final void setToolbarTitleText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.toolbarTitleText.setValue(str);
    }
}
