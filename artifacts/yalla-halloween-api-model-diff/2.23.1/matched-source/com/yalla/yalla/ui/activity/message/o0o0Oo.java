package com.yalla.yalla.ui.activity.message;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.yalla.android.videoplayer.view.VideoView;
import com.yalla.netimage.NetImageView;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.model.GiveThemeModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.share.RoomThemeGiveInfo;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import p407o0Oo0OOO.oOo000Oo;
import p474o0OoooOO.oo0oO0;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo extends Lambda implements Function1<ApiResult<RoomThemeGiveInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25537OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f25538OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f25539OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f25540OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ GiveThemeModel f25541OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(ShareToFriendsActivity shareToFriendsActivity, String str, long j, String str2, GiveThemeModel giveThemeModel) {
        super(1);
        this.f25537OooO0Oo = shareToFriendsActivity;
        this.f25539OooO0o0 = str;
        this.f25538OooO0o = j;
        this.f25540OooO0oO = str2;
        this.f25541OooO0oo = giveThemeModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RoomThemeGiveInfo> apiResult) {
        String dynamicUrl;
        String picUrl;
        ApiResult<RoomThemeGiveInfo> apiResult2 = apiResult;
        ShareToFriendsActivity shareToFriendsActivity = this.f25537OooO0Oo;
        shareToFriendsActivity.OooOo0();
        if (apiResult2.isSuccess()) {
            RoomThemeGiveInfo data = apiResult2.getData();
            if (data != null) {
                final p675oO0Oo.o0oO0Ooo o0oo0ooo2 = new p675oO0Oo.o0oO0Ooo(shareToFriendsActivity, 0);
                final ShareToFriendsActivity shareToFriendsActivity2 = this.f25537OooO0Oo;
                final long j = this.f25538OooO0o;
                final GiveThemeModel giveThemeModel = this.f25541OooO0oo;
                final oOo000Oo ooo000ooInflate = oOo000Oo.inflate(LayoutInflater.from(o0oo0ooo2.f59572OooO0Oo), o0oo0ooo2.f59573OooO0o, true);
                Intrinsics.checkNotNullExpressionValue(ooo000ooInflate, "inflate(...)");
                ooo000ooInflate.f45228OooO00o.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.activity.message.oo0O
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        oOo000Oo binding = ooo000ooInflate;
                        Intrinsics.checkNotNullParameter(binding, "$binding");
                        EditText view2 = binding.f45230OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(view2, "etMessage");
                        Intrinsics.checkNotNullParameter(view2, "view");
                        Context context = view2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        InputMethodManager inputMethodManagerOooO00o = p373o0OOo0oO.o0OOO0o.OooO00o(context);
                        p373o0OOo0oO.o00Oo0.OooO00o(view2.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view2.getWindowToken(), 0);
                        return false;
                    }
                });
                o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(shareToFriendsActivity2);
                oooO00o.OooO00o(p645o0ooOOO0.o0O0O0Oo.OooO0OO());
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                String str = (String) oo0oO0.OooO().getValue();
                float f = 46;
                int iOooO00o = com.code.android.util.o0000O0.OooO00o(f);
                oooO00o.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o, iOooO00o, str);
                oooO00o.f43125OooO00o = 0;
                oooO00o.OooO0Oo(ooo000ooInflate.f45233OooO0o0);
                ooo000ooInflate.f45235OooO0oo.setText((CharSequence) oo0oO0.OooOOoo().getValue());
                o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(shareToFriendsActivity2);
                oooO00o2.OooO00o(p645o0ooOOO0.o0O0O0Oo.OooO0OO());
                int iOooO00o2 = com.code.android.util.o0000O0.OooO00o(f);
                oooO00o2.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o2, iOooO00o2, this.f25539OooO0o0);
                oooO00o2.f43125OooO00o = 0;
                oooO00o2.OooO0Oo(ooo000ooInflate.f45234OooO0oO);
                ooo000ooInflate.f45240OooOOO0.setText(p414o0Oo0o0O.o000O00.OooO0O0(j, this.f25540OooO0oO));
                RoomThemeGiveInfo data2 = apiResult2.getData();
                if (data2 == null || (dynamicUrl = data2.getDynamicUrl()) == null) {
                    dynamicUrl = "";
                }
                boolean zIsBlank = true ^ StringsKt.isBlank(dynamicUrl);
                NetImageView ivShop = ooo000ooInflate.f45232OooO0o;
                VideoView videoView = ooo000ooInflate.f45239OooOOO;
                if (zIsBlank) {
                    Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
                    com.code.android.util.o000O.OooOOOO(videoView);
                    Intrinsics.checkNotNullExpressionValue(ivShop, "ivShop");
                    com.code.android.util.o000O.OooO0O0(ivShop);
                    o0OOo000.OooO0O0 oooO0O0 = new o0OOo000.OooO0O0();
                    shareToFriendsActivity2.f25287OooOoo0.add(oooO0O0);
                    Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
                    Intrinsics.checkNotNullParameter(videoView, "videoPlayer");
                    oooO0O0.f43006OooO00o = videoView;
                    File file = p585o0oOoo00.o00000O.f56607OooO00o;
                    p585o0oOoo00.o00000O.OooO00o(dynamicUrl).observe(o0oo0ooo2.f59574OooO0o0, new ShareToFriendsActivity.OooO0OO(new o00OOO00(o0oo0ooo2, oooO0O0)));
                    videoView.setStateChangedListener(new o00OOO0(ooo000ooInflate));
                } else {
                    Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
                    com.code.android.util.o000O.OooO0O0(videoView);
                    Intrinsics.checkNotNullExpressionValue(ivShop, "ivShop");
                    com.code.android.util.o000O.OooOOOO(ivShop);
                    o0OOo0Oo.Oooo000.OooO00o oooO00o3 = new o0OOo0Oo.Oooo000.OooO00o(shareToFriendsActivity2);
                    RoomThemeGiveInfo data3 = apiResult2.getData();
                    oooO00o3.f43127OooO0OO = (data3 == null || (picUrl = data3.getPicUrl()) == null) ? null : p184o00o00O0.OooO0OO.OooO0oo(com.code.android.util.o0000O0.OooO00o(92), com.code.android.util.o0000O0.OooO00o(115), picUrl);
                    oooO00o3.f43125OooO00o = 0;
                    oooO00o3.f43152OooOoo0 = 2;
                    oooO00o3.f43142OooOOoo = 3;
                    oooO00o3.f43139OooOOOo = p565o0oOo000.o0OOO0o.icon_room_theme_placeholder;
                    oooO00o3.OooO0o0(6);
                    oooO00o3.OooO0Oo(ivShop);
                }
                ooo000ooInflate.f45237OooOO0O.setText(data.getThemeName());
                ooo000ooInflate.f45227OooO.setText(String.valueOf(data.getPrice()));
                o0oo0ooo2.OooO0o(false);
                int timeLong = data.getTimeLong();
                TextView textView = ooo000ooInflate.f45238OooOO0o;
                if (timeLong > 0) {
                    textView.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.message_send_theme_limit_day), String.valueOf(data.getTimeLong())));
                } else {
                    textView.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.message_send_theme_permanent));
                }
                ooo000ooInflate.f45236OooOO0.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.message_send_theme_limit_count), String.valueOf(data.getGiveCount())));
                ooo000ooInflate.f45231OooO0Oo.setOnClickListener(new com.facebook.OooO0o(o0oo0ooo2, 1));
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.message_send_theme_confirm);
                StateButton stateButton = ooo000ooInflate.f45229OooO0O0;
                stateButton.setText(strOooO0OO);
                stateButton.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.message.o00OO
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        long j2 = j;
                        GiveThemeModel giveThemeModel2 = giveThemeModel;
                        Intrinsics.checkNotNullParameter(giveThemeModel2, "$giveThemeModel");
                        oOo000Oo binding = ooo000ooInflate;
                        Intrinsics.checkNotNullParameter(binding, "$binding");
                        ShareToFriendsActivity this$0 = shareToFriendsActivity2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p675oO0Oo.o0oO0Ooo this_apply = o0oo0ooo2;
                        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                        h0.OooO0O0("105034");
                        String message = binding.f45230OooO0OO.getText().toString();
                        Intrinsics.checkNotNullParameter(giveThemeModel2, "giveThemeModel");
                        Intrinsics.checkNotNullParameter(message, "message");
                        long shopId = giveThemeModel2.getShopId();
                        String themeBgName = giveThemeModel2.getThemeName();
                        String themeBgImgUrl = giveThemeModel2.getImageUrl();
                        String themeVideoUrl = giveThemeModel2.getVideoUrl();
                        Intrinsics.checkNotNullParameter(message, "message");
                        Intrinsics.checkNotNullParameter(themeBgName, "themeBgName");
                        Intrinsics.checkNotNullParameter(themeBgImgUrl, "themeBgImgUrl");
                        Intrinsics.checkNotNullParameter(themeVideoUrl, "themeVideoUrl");
                        MutableLiveData mutableLiveData = new MutableLiveData();
                        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new p414o0Oo0o0O.oo00o(j2, shopId, message, mutableLiveData, themeBgName, themeBgImgUrl, themeVideoUrl, null), 2, null);
                        mutableLiveData.observe(this$0, new ShareToFriendsActivity.OooO0OO(new o00OOO0O(this$0)));
                        this_apply.OooO0O0();
                    }
                });
                o0oo0ooo2.OooO();
            }
        } else {
            int code = apiResult2.getError().getCode();
            p437o0OoOOOo.o0OoOoOo o0oooooo = p437o0OoOOOo.o0OoOoOo.f47016OooO00o;
            if (code == 1062) {
                kotlin.collections.unsigned.OooO0O0.OooO0O0(p437o0OoOOOo.o0O00000.He_Is_Not_Your_Friend, null, 2, null, o0oooooo);
            } else if (code != 2050) {
                ApiError error = apiResult2.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p383o0OOoOo0.Oooo000(error, null), 3, null);
            } else {
                kotlin.collections.unsigned.OooO0O0.OooO0O0(p437o0OoOOOo.o0O00000.Friend_Has_This_Theme, null, 2, null, o0oooooo);
            }
        }
        return Unit.INSTANCE;
    }
}
