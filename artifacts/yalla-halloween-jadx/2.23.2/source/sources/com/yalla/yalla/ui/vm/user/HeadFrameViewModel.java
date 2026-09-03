package com.yalla.yalla.ui.vm.user;

import android.os.Looper;
import androidx.compose.foundation.layout.oo000o;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.MutableLiveData;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.google.android.gms.common.util.CollectionUtils;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.user.UserHeadFrameModel;
import com.yalla.yalla.model.user.UserHeadFrameModelList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p384o0OOoo0O.o0ooOOo;
import p394o0Oo0.OooOO0;
import p426o0OoO0o0.OooOOOO;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010(\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\b\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/HeadFrameViewModel;", "Lo0Oo0/OooOO0;", "", "getHeadFrameList", "replaceHeadFrame", "Lcom/code/android/uikit/contentstate/ContentState;", "<set-?>", "mContentState$delegate", "Landroidx/compose/runtime/MutableState;", "getMContentState", "()Lcom/code/android/uikit/contentstate/ContentState;", "setMContentState", "(Lcom/code/android/uikit/contentstate/ContentState;)V", "mContentState", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/yalla/yalla/model/user/UserHeadFrameModel;", "unLockHeaddressList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getUnLockHeaddressList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "setUnLockHeaddressList", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "lockHeaddressList", "getLockHeaddressList", "setLockHeaddressList", "", "lastSelectPosition", "I", "Landroidx/compose/runtime/MutableState;", "mTempShowUserHeaderFrameModel", "getMTempShowUserHeaderFrameModel", "()Landroidx/compose/runtime/MutableState;", "setMTempShowUserHeaderFrameModel", "(Landroidx/compose/runtime/MutableState;)V", "", "showReplaceButton$delegate", "getShowReplaceButton", "()Z", "setShowReplaceButton", "(Z)V", "showReplaceButton", "currentSelectPosition", "getCurrentSelectPosition", "()I", "setCurrentSelectPosition", "(I)V", "isNotCanClick", "Z", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nHeadFrameViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeadFrameViewModel.kt\ncom/yalla/yalla/ui/vm/user/HeadFrameViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,141:1\n81#2:142\n107#2,2:143\n81#2:145\n107#2,2:146\n*S KotlinDebug\n*F\n+ 1 HeadFrameViewModel.kt\ncom/yalla/yalla/ui/vm/user/HeadFrameViewModel\n*L\n22#1:142\n22#1:143,2\n37#1:145\n37#1:146,2\n*E\n"})
public final class HeadFrameViewModel extends OooOO0 {
    public static final int $stable = 8;
    private boolean isNotCanClick;

    /* JADX INFO: renamed from: mContentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState mContentState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Loading, null, 2, null);

    @NotNull
    private SnapshotStateList<UserHeadFrameModel> unLockHeaddressList = SnapshotStateKt.mutableStateListOf();

    @NotNull
    private SnapshotStateList<UserHeadFrameModel> lockHeaddressList = SnapshotStateKt.mutableStateListOf();
    private int lastSelectPosition = -1;

    @NotNull
    private MutableState<UserHeadFrameModel> mTempShowUserHeaderFrameModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: showReplaceButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showReplaceButton = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private int currentSelectPosition = -1;

    public static final class OooO00o extends OooO0OO.OooO0O0 {
        public OooO00o() {
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(@Nullable String str, @Nullable String str2) {
            super.OooO0O0(str, str2);
            HeadFrameViewModel.this.setMContentState(ContentState.Error);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(@NotNull String response) {
            int i;
            Intrinsics.checkNotNullParameter(response, "response");
            UserHeadFrameModelList userHeadFrameModelList = (UserHeadFrameModelList) oOOO00.OooO00o(response, UserHeadFrameModelList.class);
            HeadFrameViewModel headFrameViewModel = HeadFrameViewModel.this;
            if (userHeadFrameModelList == null || (CollectionUtils.isEmpty(userHeadFrameModelList.getDataOfLock()) && CollectionUtils.isEmpty(userHeadFrameModelList.getDataOfUnlock()))) {
                headFrameViewModel.setMContentState(ContentState.Empty);
                return;
            }
            headFrameViewModel.setMContentState(ContentState.Content);
            ArrayList<UserHeadFrameModel> dataOfUnlock = userHeadFrameModelList.getDataOfUnlock();
            Intrinsics.checkNotNullExpressionValue(dataOfUnlock, "getDataOfUnlock(...)");
            Iterator<UserHeadFrameModel> it = dataOfUnlock.iterator();
            while (it.hasNext()) {
                it.next().setLocalTypeModel(1);
            }
            ArrayList<UserHeadFrameModel> dataOfLock = userHeadFrameModelList.getDataOfLock();
            Intrinsics.checkNotNullExpressionValue(dataOfLock, "getDataOfLock(...)");
            Iterator<UserHeadFrameModel> it2 = dataOfLock.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else {
                    it2.next().setLocalTypeModel(0);
                }
            }
            ArrayList<UserHeadFrameModel> dataOfUnlock2 = userHeadFrameModelList.getDataOfUnlock();
            Intrinsics.checkNotNullExpressionValue(dataOfUnlock2, "getDataOfUnlock(...)");
            headFrameViewModel.setUnLockHeaddressList(SnapshotStateKt.toMutableStateList(dataOfUnlock2));
            ArrayList<UserHeadFrameModel> dataOfLock2 = userHeadFrameModelList.getDataOfLock();
            Intrinsics.checkNotNullExpressionValue(dataOfLock2, "getDataOfLock(...)");
            headFrameViewModel.setLockHeaddressList(SnapshotStateKt.toMutableStateList(dataOfLock2));
            headFrameViewModel.getMTempShowUserHeaderFrameModel().setValue(userHeadFrameModelList.getDataOfUnlock().get(userHeadFrameModelList.getDataOfUnlock().size() - 1));
            int size = userHeadFrameModelList.getDataOfUnlock().size();
            for (i = 0; i < size; i++) {
                UserHeadFrameModel userHeadFrameModel = userHeadFrameModelList.getDataOfUnlock().get(i);
                if (userHeadFrameModel.getIsweared() == 1) {
                    headFrameViewModel.getMTempShowUserHeaderFrameModel().setValue(userHeadFrameModel);
                    headFrameViewModel.lastSelectPosition = i;
                }
            }
            UserHeadFrameModel value = headFrameViewModel.getMTempShowUserHeaderFrameModel().getValue();
            if (value != null) {
                value.m4199setLocalSelectUnLock(true);
            }
        }
    }

    public static final class OooO0O0 extends OooO0OO.OooO0O0 {
        public OooO0O0() {
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(@NotNull String code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.OooO0O0(code, message);
            HeadFrameViewModel.this.isNotCanClick = false;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(@NotNull String response) {
            HeadFrameViewModel headFrameViewModel = HeadFrameViewModel.this;
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                try {
                    boolean z = true;
                    if (headFrameViewModel.lastSelectPosition >= 0) {
                        if (headFrameViewModel.getUnLockHeaddressList().size() > headFrameViewModel.lastSelectPosition) {
                            UserHeadFrameModel userHeadFrameModel = headFrameViewModel.getUnLockHeaddressList().get(headFrameViewModel.lastSelectPosition);
                            if (OooOo00.OooO0O0(userHeadFrameModel) && userHeadFrameModel.getIsweared() == 1) {
                                userHeadFrameModel.setIsweared(0);
                            }
                        }
                        headFrameViewModel.lastSelectPosition = headFrameViewModel.getCurrentSelectPosition();
                        UserHeadFrameModel value = headFrameViewModel.getMTempShowUserHeaderFrameModel().getValue();
                        Intrinsics.checkNotNull(value);
                        value.setIsweared(1);
                    }
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    MutableLiveData mutableLiveDataOooO0oo = o0O00oO0.OooO0oo();
                    UserHeadFrameModel value2 = headFrameViewModel.getMTempShowUserHeaderFrameModel().getValue();
                    mutableLiveDataOooO0oo.postValue(value2 != null ? value2.getPic() : null);
                    headFrameViewModel.setShowReplaceButton(false);
                    String strOooO0OO = o0000.OooO0OO(o000000.Operation_succeeded);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 runnable = new o000Oo0(strOooO0OO);
                        Intrinsics.checkNotNullParameter(runnable, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            runnable.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(runnable);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                headFrameViewModel.isNotCanClick = false;
            }
        }
    }

    public final int getCurrentSelectPosition() {
        return this.currentSelectPosition;
    }

    public final void getHeadFrameList() {
        o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
        OooO00o oooO00o = new OooO00o();
        OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43398o00000O, OooOOOO.OooO00o(), oooO00o);
    }

    @NotNull
    public final SnapshotStateList<UserHeadFrameModel> getLockHeaddressList() {
        return this.lockHeaddressList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ContentState getMContentState() {
        return (ContentState) this.mContentState.getValue();
    }

    @NotNull
    public final MutableState<UserHeadFrameModel> getMTempShowUserHeaderFrameModel() {
        return this.mTempShowUserHeaderFrameModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowReplaceButton() {
        return ((Boolean) this.showReplaceButton.getValue()).booleanValue();
    }

    @NotNull
    public final SnapshotStateList<UserHeadFrameModel> getUnLockHeaddressList() {
        return this.unLockHeaddressList;
    }

    public final void replaceHeadFrame() {
        if (this.isNotCanClick) {
            return;
        }
        this.isNotCanClick = true;
        o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
        App app = App.f22232OooO0o;
        UserHeadFrameModel value = this.mTempShowUserHeaderFrameModel.getValue();
        Intrinsics.checkNotNull(value);
        o0ooOOo.OooO0O0(app, oo000o.OooO00o(value.getHeadframeid()), new OooO0O0());
    }

    public final void setCurrentSelectPosition(int i) {
        this.currentSelectPosition = i;
    }

    public final void setLockHeaddressList(@NotNull SnapshotStateList<UserHeadFrameModel> snapshotStateList) {
        Intrinsics.checkNotNullParameter(snapshotStateList, "<set-?>");
        this.lockHeaddressList = snapshotStateList;
    }

    public final void setMContentState(@NotNull ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "<set-?>");
        this.mContentState.setValue(contentState);
    }

    public final void setMTempShowUserHeaderFrameModel(@NotNull MutableState<UserHeadFrameModel> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.mTempShowUserHeaderFrameModel = mutableState;
    }

    public final void setShowReplaceButton(boolean z) {
        this.showReplaceButton.setValue(Boolean.valueOf(z));
    }

    public final void setUnLockHeaddressList(@NotNull SnapshotStateList<UserHeadFrameModel> snapshotStateList) {
        Intrinsics.checkNotNullParameter(snapshotStateList, "<set-?>");
        this.unLockHeaddressList = snapshotStateList;
    }
}
