package p521o0o0O0o0;

import android.app.Activity;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.CheckUserBlackResultModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendShareModel;
import com.yalla.yalla.model.moment.MomentSendShareType;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.moment.MomentTypePower;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareToFriendModel;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p202o00o0o.o0OoOo0;
import p205o00o0o0o.o000O0o;
import p384o0OOoo0O.o000oOoO;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000O000 {

    public static final class OooO00o extends Lambda implements Function2<Integer, o0OoOo0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52947OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Activity f52948OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f52949OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentDetailModel, Unit> f52950OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, Activity activity, Function1<? super MomentDetailModel, Unit> function1) {
            super(2);
            this.f52947OooO0Oo = momentDetailModel;
            this.f52949OooO0o0 = momentAdapterTag;
            this.f52948OooO0o = activity;
            this.f52950OooO0oO = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, o0OoOo0 o0oooo1) {
            o0OoOo0 o0oooo2 = o0oooo1;
            String text = o0oooo2 != null ? o0oooo2.getText() : null;
            boolean zAreEqual = Intrinsics.areEqual(text, o0000.OooO0OO(o000000.share_with_friends));
            Activity context = this.f52948OooO0o;
            MomentAdapterTag momentAdapterTag = this.f52949OooO0o0;
            MomentDetailModel momentDetailModel = this.f52947OooO0Oo;
            boolean z = true;
            if (zAreEqual) {
                o0oo0000.OooO00o.OooO0O0("103040");
                if (momentDetailModel != null && momentDetailModel.getIsInHeBlack() == 1) {
                    String strOooO0OO = o0000.OooO0OO(o000000.On_His_Blacklist);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else {
                    ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareContentType.Moment);
                    shareToFriendModel.setMomentAdapterTag(momentAdapterTag);
                    shareToFriendModel.setPostDetailModel(momentDetailModel);
                    int i = ShareToFriendsActivity.f25275Oooo00o;
                    ShareToFriendsActivity.OooO00o.OooO00o(context, shareToFriendModel);
                }
            } else if (Intrinsics.areEqual(text, o0000.OooO0OO(o000000.video_feed_download))) {
                Function1<MomentDetailModel, Unit> function1 = this.f52950OooO0oO;
                if (function1 != null) {
                    function1.invoke(momentDetailModel);
                }
            } else if (Intrinsics.areEqual(text, o0000.OooO0OO(o000000.Repost))) {
                if (momentDetailModel != null && momentDetailModel.getIsInHeBlack() == 1) {
                    String strOooO0OO2 = o0000.OooO0OO(o000000.On_His_Blacklist);
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                        }
                    }
                } else {
                    int i2 = MomentSendActivity.f25726Oooo0OO;
                    Intrinsics.checkNotNullParameter(context, "context");
                    MomentSendShareModel momentSendShareModel = new MomentSendShareModel(MomentType.Forward.getValue());
                    momentSendShareModel.setSharePostType(MomentSendShareType.ForwardPost);
                    momentSendShareModel.setForwardMomentDetailModel(momentDetailModel);
                    momentSendShareModel.setMomentAdapterTag(momentAdapterTag);
                    MomentSendActivity.OooO00o.OooO0O0(context, momentSendShareModel);
                    o0oo0000.OooO00o.OooO0O0("104018");
                }
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO00o(@Nullable Activity activity, @Nullable MomentDetailModel momentDetailModel, @Nullable MomentAdapterTag momentAdapterTag, @NotNull BaseMomentDetailVM momentVM, @Nullable Function0 function0, @Nullable Function1 function1) {
        Intrinsics.checkNotNullParameter(momentVM, "momentVM");
        if (activity == 0) {
            return;
        }
        if (momentDetailModel != null && momentDetailModel.getIsInHeBlack() == -1) {
            long userId = momentDetailModel.getUserId();
            StringBuilder sb = new StringBuilder();
            sb.append(userId);
            if (!o0O0O0Oo.OooO0oo(sb.toString())) {
                long userId2 = momentDetailModel.getUserId();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(userId2);
                LiveData<ApiResult<CheckUserBlackResultModel>> liveDataCheckUserBlack = momentVM.checkUserBlack(sb2.toString());
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                liveDataCheckUserBlack.observe((LifecycleOwner) activity, new o000oOoO(new o000(momentDetailModel), null, null, false));
            }
        }
        o000O0o o000o0o2 = new o000O0o(activity, function0);
        o000o0o2.OooOOO0(o0000.OooO0OO(o000000.share_with_friends));
        Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(lValueOf, o0O00oO0.OooOOo0().getValue())) {
            if ((momentDetailModel != null && momentDetailModel.getType() == MomentType.Video.getValue()) && momentAdapterTag == MomentAdapterTag.VideoFeedList) {
                o000o0o2.OooOOO0(o0000.OooO0OO(o000000.video_feed_download));
            }
        }
        if (momentDetailModel != null && momentDetailModel.getPower() == MomentTypePower.Open.getValue()) {
            o000o0o2.OooOOO0(o0000.OooO0OO(o000000.Repost));
        }
        o000o0o2.OooOOo0(new OooO00o(momentDetailModel, momentAdapterTag, activity, function1));
        o000o0o2.OooOO0o();
    }
}
