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
import p409o0Oo0OOO.o;
import p409o0Oo0OOO.oO00000;
import p409o0Oo0OOO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements FeatureManager.Callback, androidx.activity.result.OooO00o, p187o00o00Oo.o0ooOOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12702Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12703OoooO00;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f12702Oooo = i;
        this.f12703OoooO00 = obj;
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f12702Oooo) {
            case 2:
                MomentEditRecordActivity this$0 = (MomentEditRecordActivity) this.f12703OoooO00;
                MomentEditRecordActivity.OooO00o oooO00o = MomentEditRecordActivity.f22334ooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((PostGifPlayControl) this$0.f22337OooooOo.getValue()).OooO0OO();
                this$0.Oooo00O(true);
                break;
            case 3:
                RoomLuckyNumberHistoryDialog this$1 = (RoomLuckyNumberHistoryDialog) this.f12703OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOOo0(false);
                break;
            case 4:
                MainMomentsTopicAddMoreFragment.m346initView$lambda3((MainMomentsTopicAddMoreFragment) this.f12703OoooO00);
                break;
            default:
                MainRoomMineJoinedFragment.m471initView$lambda2((MainRoomMineJoinedFragment) this.f12703OoooO00);
                break;
        }
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        o this$0 = (o) this.f12703OoooO00;
        Map grantResults = (Map) obj;
        int i = o.f39123OoooOOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(grantResults, "grantResults");
        if (this$0.OooO00o()) {
            oO00000 oo00000 = this$0.f39124Oooo;
            oO00000 oo00001 = null;
            oO0Oo oo0oo = null;
            if (oo00000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000 = null;
            }
            oo00000.f39144OooO0oO.clear();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : grantResults.entrySet()) {
                String str = (String) entry.getKey();
                if (((Boolean) entry.getValue()).booleanValue()) {
                    oO00000 oo00002 = this$0.f39124Oooo;
                    if (oo00002 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00002 = null;
                    }
                    oo00002.f39144OooO0oO.add(str);
                    oO00000 oo00003 = this$0.f39124Oooo;
                    if (oo00003 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00003 = null;
                    }
                    oo00003.f39145OooO0oo.remove(str);
                    oO00000 oo00004 = this$0.f39124Oooo;
                    if (oo00004 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00004 = null;
                    }
                    oo00004.f39137OooO.remove(str);
                } else if (this$0.shouldShowRequestPermissionRationale(str)) {
                    arrayList.add(str);
                    oO00000 oo00005 = this$0.f39124Oooo;
                    if (oo00005 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00005 = null;
                    }
                    oo00005.f39145OooO0oo.add(str);
                } else {
                    arrayList2.add(str);
                    oO00000 oo00006 = this$0.f39124Oooo;
                    if (oo00006 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00006 = null;
                    }
                    oo00006.f39137OooO.add(str);
                    oO00000 oo00007 = this$0.f39124Oooo;
                    if (oo00007 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo00007 = null;
                    }
                    oo00007.f39145OooO0oo.remove(str);
                }
            }
            ArrayList<String> arrayList3 = new ArrayList();
            oO00000 oo00008 = this$0.f39124Oooo;
            if (oo00008 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00008 = null;
            }
            arrayList3.addAll(oo00008.f39145OooO0oo);
            oO00000 oo00009 = this$0.f39124Oooo;
            if (oo00009 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00009 = null;
            }
            arrayList3.addAll(oo00009.f39137OooO);
            for (String str2 : arrayList3) {
                if (o0Oo0oo.OooO0OO(this$0.getContext(), str2)) {
                    oO00000 oo000010 = this$0.f39124Oooo;
                    if (oo000010 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo000010 = null;
                    }
                    oo000010.f39145OooO0oo.remove(str2);
                    oO00000 oo000011 = this$0.f39124Oooo;
                    if (oo000011 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo000011 = null;
                    }
                    oo000011.f39144OooO0oO.add(str2);
                }
            }
            oO00000 oo000012 = this$0.f39124Oooo;
            if (oo000012 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo000012 = null;
            }
            int size = oo000012.f39144OooO0oO.size();
            oO00000 oo000013 = this$0.f39124Oooo;
            if (oo000013 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo000013 = null;
            }
            if (size == oo000013.f39141OooO0Oo.size()) {
                oO0Oo oo0oo2 = this$0.f39127OoooO00;
                if (oo0oo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    oo0oo = oo0oo2;
                }
                oo0oo.OooO0O0();
                return;
            }
            oO00000 oo000014 = this$0.f39124Oooo;
            if (oo000014 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo000014 = null;
            }
            Objects.requireNonNull(oo000014);
            oO00000 oo000015 = this$0.f39124Oooo;
            if (oo000015 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo000015 = null;
            }
            Objects.requireNonNull(oo000015);
            oO00000 oo000016 = this$0.f39124Oooo;
            if (oo000016 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo000016 = null;
            }
            Objects.requireNonNull(oo000016);
            oO0Oo oo0oo3 = this$0.f39127OoooO00;
            if (oo0oo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("task");
                oo0oo3 = null;
            }
            oo0oo3.OooO0O0();
            oO00000 oo000017 = this$0.f39124Oooo;
            if (oo000017 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo00001 = oo000017;
            }
            Objects.requireNonNull(oo00001);
        }
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        FacebookException.m91_init_$lambda0((String) this.f12703OoooO00, z);
    }
}
