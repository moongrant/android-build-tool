package com.facebook;

import com.app.base.impl.PostGifPlayControl;
import com.facebook.internal.FeatureManager;
import com.yalla.yalla.ui.activity.moment.MomentEditRecordActivity;
import com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog;
import com.yalla.yalla.ui.fragment.MainMomentsTopicAddMoreFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p034OoooO0O.o0Oo0oo;
import p186o00o00Oo.o0ooOOo;
import p406o0Oo0OOO.o0oo0000;
import p406o0Oo0OOO.oO00000;
import p406o0Oo0OOO.oO00000o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements FeatureManager.Callback, androidx.activity.result.OooO00o, o0ooOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f12687OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f12688OooO0o0;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f12687OooO0Oo = i;
        this.f12688OooO0o0 = obj;
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f12687OooO0Oo) {
            case 2:
                MomentEditRecordActivity this$0 = (MomentEditRecordActivity) this.f12688OooO0o0;
                MomentEditRecordActivity.OooO00o oooO00o = MomentEditRecordActivity.f22315OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((PostGifPlayControl) this$0.f22318Ooooo0o.getValue()).OooO0OO();
                this$0.Oooo00O(true);
                break;
            case 3:
                RoomLuckyNumberHistoryDialog this$1 = (RoomLuckyNumberHistoryDialog) this.f12688OooO0o0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOOo0(false);
                break;
            case 4:
                MainMomentsTopicAddMoreFragment.m346initView$lambda3((MainMomentsTopicAddMoreFragment) this.f12688OooO0o0);
                break;
            default:
                MainRoomMineJoinedFragment.m471initView$lambda2((MainRoomMineJoinedFragment) this.f12688OooO0o0);
                break;
        }
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        oO00000 this$0 = (oO00000) this.f12688OooO0o0;
        Map grantResults = (Map) obj;
        int i = oO00000.f39104OoooOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(grantResults, "grantResults");
        if (this$0.OooO00o()) {
            oO00000o oo00000o = this$0.f39106Oooo0o;
            oO00000o oo00000o2 = null;
            o0oo0000 o0oo0000Var = null;
            if (oo00000o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o = null;
            }
            oo00000o.f39120OooO0oO.clear();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : grantResults.entrySet()) {
                String str = (String) entry.getKey();
                if (((Boolean) entry.getValue()).booleanValue()) {
                    oO00000o oo00000o3 = this$0.f39106Oooo0o;
                    if (oo00000o3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00000o3 = null;
                    }
                    oo00000o3.f39120OooO0oO.add(str);
                    oO00000o oo00000o4 = this$0.f39106Oooo0o;
                    if (oo00000o4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00000o4 = null;
                    }
                    oo00000o4.f39121OooO0oo.remove(str);
                    oO00000o oo00000o5 = this$0.f39106Oooo0o;
                    if (oo00000o5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00000o5 = null;
                    }
                    oo00000o5.f39113OooO.remove(str);
                } else if (this$0.shouldShowRequestPermissionRationale(str)) {
                    arrayList.add(str);
                    oO00000o oo00000o6 = this$0.f39106Oooo0o;
                    if (oo00000o6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00000o6 = null;
                    }
                    oo00000o6.f39121OooO0oo.add(str);
                } else {
                    arrayList2.add(str);
                    oO00000o oo00000o7 = this$0.f39106Oooo0o;
                    if (oo00000o7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00000o7 = null;
                    }
                    oo00000o7.f39113OooO.add(str);
                    oO00000o oo00000o8 = this$0.f39106Oooo0o;
                    if (oo00000o8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00000o8 = null;
                    }
                    oo00000o8.f39121OooO0oo.remove(str);
                }
            }
            ArrayList<String> arrayList3 = new ArrayList();
            oO00000o oo00000o9 = this$0.f39106Oooo0o;
            if (oo00000o9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o9 = null;
            }
            arrayList3.addAll(oo00000o9.f39121OooO0oo);
            oO00000o oo00000o10 = this$0.f39106Oooo0o;
            if (oo00000o10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o10 = null;
            }
            arrayList3.addAll(oo00000o10.f39113OooO);
            for (String str2 : arrayList3) {
                if (o0Oo0oo.OooO0OO(this$0.getContext(), str2)) {
                    oO00000o oo00000o11 = this$0.f39106Oooo0o;
                    if (oo00000o11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00000o11 = null;
                    }
                    oo00000o11.f39121OooO0oo.remove(str2);
                    oO00000o oo00000o12 = this$0.f39106Oooo0o;
                    if (oo00000o12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00000o12 = null;
                    }
                    oo00000o12.f39120OooO0oO.add(str2);
                }
            }
            oO00000o oo00000o13 = this$0.f39106Oooo0o;
            if (oo00000o13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o13 = null;
            }
            int size = oo00000o13.f39120OooO0oO.size();
            oO00000o oo00000o14 = this$0.f39106Oooo0o;
            if (oo00000o14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o14 = null;
            }
            if (size == oo00000o14.f39117OooO0Oo.size()) {
                o0oo0000 o0oo0000Var2 = this$0.f39107Oooo0oO;
                if (o0oo0000Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0000Var = o0oo0000Var2;
                }
                o0oo0000Var.OooO0O0();
                return;
            }
            oO00000o oo00000o15 = this$0.f39106Oooo0o;
            if (oo00000o15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o15 = null;
            }
            Objects.requireNonNull(oo00000o15);
            oO00000o oo00000o16 = this$0.f39106Oooo0o;
            if (oo00000o16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o16 = null;
            }
            Objects.requireNonNull(oo00000o16);
            oO00000o oo00000o17 = this$0.f39106Oooo0o;
            if (oo00000o17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o17 = null;
            }
            Objects.requireNonNull(oo00000o17);
            o0oo0000 o0oo0000Var3 = this$0.f39107Oooo0oO;
            if (o0oo0000Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("task");
                o0oo0000Var3 = null;
            }
            o0oo0000Var3.OooO0O0();
            oO00000o oo00000o18 = this$0.f39106Oooo0o;
            if (oo00000o18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo00000o2 = oo00000o18;
            }
            Objects.requireNonNull(oo00000o2);
        }
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        FacebookException.m91_init_$lambda0((String) this.f12688OooO0o0, z);
    }
}
