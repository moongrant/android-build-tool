package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.application.App;
import com.app.base.model.UserHeadFrameModel;
import com.app.base.model.UserHeadFrameModelList;
import com.code.android.util.ToastUtil;
import com.google.android.gms.common.util.CollectionUtils;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import come.code.android.easyrefreshcontentstatus.ContentState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.o00OO0OO;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o000OOo;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R*\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010/\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0013\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/HeadFrameViewModel;", "Lo00OO/OooO00o;", "", "getHeadFrameList", "replaceHeadFrame", "", "lastSelectPosition", "I", "currentSelectPosition", "getCurrentSelectPosition", "()I", "setCurrentSelectPosition", "(I)V", "", "isNotCanClick", "Z", "Lcome/code/android/easyrefreshcontentstatus/ContentState;", "<set-?>", "mContentState$delegate", "Lo000oOoO/o0O00OO;", "getMContentState", "()Lcome/code/android/easyrefreshcontentstatus/ContentState;", "setMContentState", "(Lcome/code/android/easyrefreshcontentstatus/ContentState;)V", "mContentState", "LOooooo0/o00OO0OO;", "Lcom/app/base/model/UserHeadFrameModel;", "unLockHeaddressList", "LOooooo0/o00OO0OO;", "getUnLockHeaddressList", "()LOooooo0/o00OO0OO;", "setUnLockHeaddressList", "(LOooooo0/o00OO0OO;)V", "lockHeaddressList", "getLockHeaddressList", "setLockHeaddressList", "Lo000oOoO/o0O00OO;", "mTempShowUserHeaderFrameModel", "getMTempShowUserHeaderFrameModel", "()Lo000oOoO/o0O00OO;", "setMTempShowUserHeaderFrameModel", "(Lo000oOoO/o0O00OO;)V", "showReplaceButton$delegate", "getShowReplaceButton", "()Z", "setShowReplaceButton", "(Z)V", "showReplaceButton", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class HeadFrameViewModel extends o00OO.OooO00o {
    public static final int $stable = 8;
    private boolean isNotCanClick;

    /* JADX INFO: renamed from: mContentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO mContentState = o0OOO00.OooO0Oo(ContentState.Loading);

    @NotNull
    private o00OO0OO<UserHeadFrameModel> unLockHeaddressList = new o00OO0OO<>();

    @NotNull
    private o00OO0OO<UserHeadFrameModel> lockHeaddressList = new o00OO0OO<>();
    private int lastSelectPosition = -1;

    @NotNull
    private o0O00OO<UserHeadFrameModel> mTempShowUserHeaderFrameModel = o0OOO00.OooO0Oo(null);

    /* JADX INFO: renamed from: showReplaceButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO showReplaceButton = o0OOO00.OooO0Oo(Boolean.FALSE);
    private int currentSelectPosition = -1;

    public static final class OooO00o extends o00OO0O0.OooO0O0 {
        public OooO00o() {
        }

        public final List<UserHeadFrameModel> OooO00o(List<UserHeadFrameModel> list, int i) {
            Iterator<UserHeadFrameModel> it = list.iterator();
            while (it.hasNext()) {
                it.next().setLocalTypeModel(i);
            }
            return list;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            super.onError(str, str2);
            HeadFrameViewModel.this.setMContentState(ContentState.Error);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            super.onFinish(response);
            UserHeadFrameModelList userHeadFrameModelList = (UserHeadFrameModelList) o0Oo0oo.OooO0O0(response, UserHeadFrameModelList.class);
            if (userHeadFrameModelList == null || (CollectionUtils.isEmpty(userHeadFrameModelList.getDataOfLock()) && CollectionUtils.isEmpty(userHeadFrameModelList.getDataOfUnlock()))) {
                HeadFrameViewModel.this.setMContentState(ContentState.Empty);
                return;
            }
            HeadFrameViewModel.this.setMContentState(ContentState.Content);
            ArrayList<UserHeadFrameModel> dataOfUnlock = userHeadFrameModelList.getDataOfUnlock();
            Intrinsics.checkNotNullExpressionValue(dataOfUnlock, "result.dataOfUnlock");
            OooO00o(dataOfUnlock, 1);
            ArrayList<UserHeadFrameModel> dataOfLock = userHeadFrameModelList.getDataOfLock();
            Intrinsics.checkNotNullExpressionValue(dataOfLock, "result.dataOfLock");
            OooO00o(dataOfLock, 0);
            HeadFrameViewModel headFrameViewModel = HeadFrameViewModel.this;
            ArrayList<UserHeadFrameModel> dataOfUnlock2 = userHeadFrameModelList.getDataOfUnlock();
            Intrinsics.checkNotNullExpressionValue(dataOfUnlock2, "result.dataOfUnlock");
            Intrinsics.checkNotNullParameter(dataOfUnlock2, "<this>");
            o00OO0OO<UserHeadFrameModel> o00oo0oo = new o00OO0OO<>();
            o00oo0oo.addAll(dataOfUnlock2);
            headFrameViewModel.setUnLockHeaddressList(o00oo0oo);
            HeadFrameViewModel headFrameViewModel2 = HeadFrameViewModel.this;
            ArrayList<UserHeadFrameModel> dataOfLock2 = userHeadFrameModelList.getDataOfLock();
            Intrinsics.checkNotNullExpressionValue(dataOfLock2, "result.dataOfLock");
            Intrinsics.checkNotNullParameter(dataOfLock2, "<this>");
            o00OO0OO<UserHeadFrameModel> o00oo0oo2 = new o00OO0OO<>();
            o00oo0oo2.addAll(dataOfLock2);
            headFrameViewModel2.setLockHeaddressList(o00oo0oo2);
            HeadFrameViewModel.this.getMTempShowUserHeaderFrameModel().setValue(userHeadFrameModelList.getDataOfUnlock().get(userHeadFrameModelList.getDataOfUnlock().size() - 1));
            int size = userHeadFrameModelList.getDataOfUnlock().size();
            for (int i = 0; i < size; i++) {
                UserHeadFrameModel userHeadFrameModel = userHeadFrameModelList.getDataOfUnlock().get(i);
                if (userHeadFrameModel.getIsweared() == 1) {
                    HeadFrameViewModel.this.getMTempShowUserHeaderFrameModel().setValue(userHeadFrameModel);
                    HeadFrameViewModel.this.lastSelectPosition = i;
                }
            }
            UserHeadFrameModel value = HeadFrameViewModel.this.getMTempShowUserHeaderFrameModel().getValue();
            if (value != null) {
                value.m84setLocalSelectUnLock(true);
            }
        }
    }

    public static final class OooO0O0 extends o00OO0O0.OooO0O0 {
        public OooO0O0() {
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.onError(code2, message);
            HeadFrameViewModel.this.isNotCanClick = false;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            super.onFinish(response);
            try {
                try {
                    if (HeadFrameViewModel.this.lastSelectPosition >= 0) {
                        if (HeadFrameViewModel.this.getUnLockHeaddressList().size() > HeadFrameViewModel.this.lastSelectPosition) {
                            UserHeadFrameModel userHeadFrameModel = HeadFrameViewModel.this.getUnLockHeaddressList().get(HeadFrameViewModel.this.lastSelectPosition);
                            if (OooO0OO.OooO0O0(userHeadFrameModel) && userHeadFrameModel.getIsweared() == 1) {
                                userHeadFrameModel.setIsweared(0);
                            }
                        }
                        HeadFrameViewModel headFrameViewModel = HeadFrameViewModel.this;
                        headFrameViewModel.lastSelectPosition = headFrameViewModel.getCurrentSelectPosition();
                        UserHeadFrameModel value = HeadFrameViewModel.this.getMTempShowUserHeaderFrameModel().getValue();
                        Intrinsics.checkNotNull(value);
                        value.setIsweared(1);
                    }
                    MutableLiveData<String> mutableLiveDataOooO0oO = OooOOO.f41216OooO00o.OooO0oO();
                    UserHeadFrameModel value2 = HeadFrameViewModel.this.getMTempShowUserHeaderFrameModel().getValue();
                    mutableLiveDataOooO0oO.postValue(value2 != null ? value2.getPic() : null);
                    HeadFrameViewModel.this.setShowReplaceButton(false);
                    ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Operation_succeeded));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                HeadFrameViewModel.this.isNotCanClick = false;
            }
        }
    }

    public final int getCurrentSelectPosition() {
        return this.currentSelectPosition;
    }

    public final void getHeadFrameList() {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o000OOo o000ooo2 = o00000OO.f32209OooO0OO;
        OooO00o oooO00o = new OooO00o();
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32302o0000Ooo, mapOooO0O0, oooO00o);
    }

    @NotNull
    public final o00OO0OO<UserHeadFrameModel> getLockHeaddressList() {
        return this.lockHeaddressList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ContentState getMContentState() {
        return (ContentState) this.mContentState.getValue();
    }

    @NotNull
    public final o0O00OO<UserHeadFrameModel> getMTempShowUserHeaderFrameModel() {
        return this.mTempShowUserHeaderFrameModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowReplaceButton() {
        return ((Boolean) this.showReplaceButton.getValue()).booleanValue();
    }

    @NotNull
    public final o00OO0OO<UserHeadFrameModel> getUnLockHeaddressList() {
        return this.unLockHeaddressList;
    }

    public final void replaceHeadFrame() {
        if (this.isNotCanClick) {
            return;
        }
        this.isNotCanClick = true;
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o000OOo o000ooo2 = o00000OO.f32209OooO0OO;
        App app = App.f11458Oooo0oO;
        StringBuilder sb = new StringBuilder();
        UserHeadFrameModel value = this.mTempShowUserHeaderFrameModel.getValue();
        Intrinsics.checkNotNull(value);
        sb.append(value.getHeadframeid());
        sb.append("");
        o000ooo2.OooO0OO(app, sb.toString(), new OooO0O0());
    }

    public final void setCurrentSelectPosition(int i) {
        this.currentSelectPosition = i;
    }

    public final void setLockHeaddressList(@NotNull o00OO0OO<UserHeadFrameModel> o00oo0oo) {
        Intrinsics.checkNotNullParameter(o00oo0oo, "<set-?>");
        this.lockHeaddressList = o00oo0oo;
    }

    public final void setMContentState(@NotNull ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "<set-?>");
        this.mContentState.setValue(contentState);
    }

    public final void setMTempShowUserHeaderFrameModel(@NotNull o0O00OO<UserHeadFrameModel> o0o00oo2) {
        Intrinsics.checkNotNullParameter(o0o00oo2, "<set-?>");
        this.mTempShowUserHeaderFrameModel = o0o00oo2;
    }

    public final void setShowReplaceButton(boolean z) {
        this.showReplaceButton.setValue(Boolean.valueOf(z));
    }

    public final void setUnLockHeaddressList(@NotNull o00OO0OO<UserHeadFrameModel> o00oo0oo) {
        Intrinsics.checkNotNullParameter(o00oo0oo, "<set-?>");
        this.unLockHeaddressList = o00oo0oo;
    }
}
