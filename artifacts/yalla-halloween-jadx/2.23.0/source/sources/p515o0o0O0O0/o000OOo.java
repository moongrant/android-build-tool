package p515o0o0O0O0;

import android.app.Activity;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
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
import p156o00OoOO.OooOo00;
import p157o00OoOO0.o00O0O;
import p377o0OOoOo.o0000OO0;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo {

    public static final class OooO00o extends Lambda implements Function2<Integer, OooOo00, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51805OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Activity f51806OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51807OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentDetailModel, Unit> f51808OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, Activity activity, Function1<? super MomentDetailModel, Unit> function1) {
            super(2);
            this.f51805OooO0Oo = momentDetailModel;
            this.f51807OooO0o0 = momentAdapterTag;
            this.f51806OooO0o = activity;
            this.f51808OooO0oO = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, OooOo00 oooOo00) {
            OooOo00 oooOo01 = oooOo00;
            String text = oooOo01 != null ? oooOo01.getText() : null;
            boolean zAreEqual = Intrinsics.areEqual(text, o0000.OooO0OO(oO00OOo0.share_with_friends));
            Activity context = this.f51806OooO0o;
            MomentAdapterTag momentAdapterTag = this.f51807OooO0o0;
            MomentDetailModel momentDetailModel = this.f51805OooO0Oo;
            boolean z = true;
            if (zAreEqual) {
                o0OO000.OooO00o("103040");
                if (momentDetailModel != null && momentDetailModel.getIsInHeBlack() == 1) {
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.On_His_Blacklist);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else {
                    ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareContentType.Moment);
                    shareToFriendModel.setMomentAdapterTag(momentAdapterTag);
                    shareToFriendModel.setPostDetailModel(momentDetailModel);
                    int i = ShareToFriendsActivity.f25730Oooo00o;
                    ShareToFriendsActivity.OooO00o.OooO00o(context, shareToFriendModel);
                }
            } else if (Intrinsics.areEqual(text, o0000.OooO0OO(oO00OOo0.video_feed_download))) {
                Function1<MomentDetailModel, Unit> function1 = this.f51808OooO0oO;
                if (function1 != null) {
                    function1.invoke(momentDetailModel);
                }
            } else if (Intrinsics.areEqual(text, o0000.OooO0OO(oO00OOo0.Repost))) {
                if (momentDetailModel != null && momentDetailModel.getIsInHeBlack() == 1) {
                    String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.On_His_Blacklist);
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                        }
                    }
                } else {
                    int i2 = MomentSendActivity.f26175Oooo0OO;
                    Intrinsics.checkNotNullParameter(context, "context");
                    MomentSendShareModel momentSendShareModel = new MomentSendShareModel(MomentType.Forward.getValue());
                    momentSendShareModel.setSharePostType(MomentSendShareType.ForwardPost);
                    momentSendShareModel.setForwardMomentDetailModel(momentDetailModel);
                    momentSendShareModel.setMomentAdapterTag(momentAdapterTag);
                    MomentSendActivity.OooO00o.OooO0O0(context, momentSendShareModel);
                    o0OO000.OooO00o("104018");
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
            if (!OooOOOO.OooO0oo(sb.toString())) {
                long userId2 = momentDetailModel.getUserId();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(userId2);
                LiveData<ApiResult<CheckUserBlackResultModel>> liveDataCheckUserBlack = momentVM.checkUserBlack(sb2.toString());
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                liveDataCheckUserBlack.observe((LifecycleOwner) activity, new o0000OO0(new o0O0O00(momentDetailModel), null, null, false));
            }
        }
        o00O0O o00o0o2 = new o00O0O(activity, function0);
        o00o0o2.OooOOO0(o0000.OooO0OO(oO00OOo0.share_with_friends));
        Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(lValueOf, o000000O.OooOOo0().getValue())) {
            if ((momentDetailModel != null && momentDetailModel.getType() == MomentType.Video.getValue()) && momentAdapterTag == MomentAdapterTag.VideoFeedList) {
                o00o0o2.OooOOO0(o0000.OooO0OO(oO00OOo0.video_feed_download));
            }
        }
        if (momentDetailModel != null && momentDetailModel.getPower() == MomentTypePower.Open.getValue()) {
            o00o0o2.OooOOO0(o0000.OooO0OO(oO00OOo0.Repost));
        }
        o00o0o2.OooOOo0(new OooO00o(momentDetailModel, momentAdapterTag, activity, function1));
        o00o0o2.OooOO0o();
    }
}
