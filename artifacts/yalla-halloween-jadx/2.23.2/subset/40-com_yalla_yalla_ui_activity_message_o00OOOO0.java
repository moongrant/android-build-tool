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
import p405o0Oo0OOO.oO0OO00o;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 extends Lambda implements Function1<ApiResult<RoomThemeGiveInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25460OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f25461OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f25462OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f25463OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ GiveThemeModel f25464OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(ShareToFriendsActivity shareToFriendsActivity, String str, long j, String str2, GiveThemeModel giveThemeModel) {
        super(1);
        this.f25460OooO0Oo = shareToFriendsActivity;
        this.f25462OooO0o0 = str;
        this.f25461OooO0o = j;
        this.f25463OooO0oO = str2;
        this.f25464OooO0oo = giveThemeModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RoomThemeGiveInfo> apiResult) {
        String dynamicUrl;
        String picUrl;
        ApiResult<RoomThemeGiveInfo> apiResult2 = apiResult;
        ShareToFriendsActivity shareToFriendsActivity = this.f25460OooO0Oo;
        shareToFriendsActivity.OooOo0();
        if (apiResult2.isSuccess()) {
            RoomThemeGiveInfo data = apiResult2.getData();
            if (data != null) {
                final p650o0ooo.o000OO00 o000oo01 = new p650o0ooo.o000OO00(shareToFriendsActivity, 0);
                final ShareToFriendsActivity shareToFriendsActivity2 = this.f25460OooO0Oo;
                final long j = this.f25461OooO0o;
                final GiveThemeModel giveThemeModel = this.f25464OooO0oo;
                final oO0OO00o oo0oo00oInflate = oO0OO00o.inflate(LayoutInflater.from(o000oo01.f58507OooO0Oo), o000oo01.f58508OooO0o, true);
                Intrinsics.checkNotNullExpressionValue(oo0oo00oInflate, "inflate(...)");
                oo0oo00oInflate.f44903OooO00o.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.activity.message.oo0O
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        oO0OO00o binding = oo0oo00oInflate;
                        Intrinsics.checkNotNullParameter(binding, "$binding");
                        EditText view2 = binding.f44905OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(view2, "etMessage");
                        Intrinsics.checkNotNullParameter(view2, "view");
                        Context context = view2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o0OOO0o.OooO00o(context);
                        kotlin.collections.OooO00o.OooO0O0(view2.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view2.getWindowToken(), 0);
                        return false;
                    }
                });
                o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(shareToFriendsActivity2);
                oooO00o.OooO00o(d1.OooO0OO());
                p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                String str = (String) p475o0Ooooo0.o0O00oO0.OooO().getValue();
                float f = 46;
                int iOooO00o = com.code.android.util.o0000O0.OooO00o(f);
                oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o, iOooO00o, str);
                oooO00o.f43124OooO00o = 0;
                oooO00o.OooO0Oo(oo0oo00oInflate.f44908OooO0o0);
                oo0oo00oInflate.f44910OooO0oo.setText((CharSequence) p475o0Ooooo0.o0O00oO0.OooOOoo().getValue());
                o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(shareToFriendsActivity2);
                oooO00o2.OooO00o(d1.OooO0OO());
                int iOooO00o2 = com.code.android.util.o0000O0.OooO00o(f);
                oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o2, iOooO00o2, this.f25462OooO0o0);
                oooO00o2.f43124OooO00o = 0;
                oooO00o2.OooO0Oo(oo0oo00oInflate.f44909OooO0oO);
                oo0oo00oInflate.f44915OooOOO0.setText(p412o0Oo0o0O.o000O000.OooO0O0(j, this.f25463OooO0oO));
                RoomThemeGiveInfo data2 = apiResult2.getData();
                if (data2 == null || (dynamicUrl = data2.getDynamicUrl()) == null) {
                    dynamicUrl = "";
                }
                boolean zIsBlank = true ^ StringsKt.isBlank(dynamicUrl);
                NetImageView ivShop = oo0oo00oInflate.f44907OooO0o;
                VideoView videoView = oo0oo00oInflate.f44914OooOOO;
                if (zIsBlank) {
                    Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
                    com.code.android.util.o000O.OooOOOO(videoView);
                    Intrinsics.checkNotNullExpressionValue(ivShop, "ivShop");
                    com.code.android.util.o000O.OooO0O0(ivShop);
                    o0OOo000.OooO0O0 oooO0O0 = new o0OOo000.OooO0O0();
                    shareToFriendsActivity2.f25286OooOoo0.add(oooO0O0);
                    Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
                    Intrinsics.checkNotNullParameter(videoView, "videoPlayer");
                    oooO0O0.f43005OooO00o = videoView;
                    File file = p583o0oOoo00.o00000O.f56650OooO00o;
                    p583o0oOoo00.o00000O.OooO00o(dynamicUrl).observe(o000oo01.f58509OooO0o0, new ShareToFriendsActivity.OooO0OO(new o00OOO0(o000oo01, oooO0O0)));
                    videoView.setStateChangedListener(new o00OOO0O(oo0oo00oInflate));
                } else {
                    Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
                    com.code.android.util.o000O.OooO0O0(videoView);
                    Intrinsics.checkNotNullExpressionValue(ivShop, "ivShop");
                    com.code.android.util.o000O.OooOOOO(ivShop);
                    o0OOo0Oo.Oooo000.OooO00o oooO00o3 = new o0OOo0Oo.Oooo000.OooO00o(shareToFriendsActivity2);
                    RoomThemeGiveInfo data3 = apiResult2.getData();
                    oooO00o3.f43126OooO0OO = (data3 == null || (picUrl = data3.getPicUrl()) == null) ? null : p184o00o00O0.OooO0OO.OooO0oo(com.code.android.util.o0000O0.OooO00o(92), com.code.android.util.o0000O0.OooO00o(115), picUrl);
                    oooO00o3.f43124OooO00o = 0;
                    oooO00o3.f43151OooOoo0 = 2;
                    oooO00o3.f43141OooOOoo = 3;
                    oooO00o3.f43138OooOOOo = p562o0oOo000.o0Oo0oo.icon_room_theme_placeholder;
                    oooO00o3.OooO0o0(6);
                    oooO00o3.OooO0Oo(ivShop);
                }
                oo0oo00oInflate.f44912OooOO0O.setText(data.getThemeName());
                oo0oo00oInflate.f44902OooO.setText(String.valueOf(data.getPrice()));
                o000oo01.OooO0o(false);
                int timeLong = data.getTimeLong();
                TextView textView = oo0oo00oInflate.f44913OooOO0o;
                if (timeLong > 0) {
                    textView.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_send_theme_limit_day), String.valueOf(data.getTimeLong())));
                } else {
                    textView.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_send_theme_permanent));
                }
                oo0oo00oInflate.f44911OooOO0.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_send_theme_limit_count), String.valueOf(data.getGiveCount())));
                oo0oo00oInflate.f44906OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.message.o00OO
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        p650o0ooo.o000OO00 this_apply = o000oo01;
                        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                        this_apply.OooO0O0();
                    }
                });
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_send_theme_confirm);
                StateButton stateButton = oo0oo00oInflate.f44904OooO0O0;
                stateButton.setText(strOooO0OO);
                stateButton.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.message.o00OOO00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        long j2 = j;
                        GiveThemeModel giveThemeModel2 = giveThemeModel;
                        Intrinsics.checkNotNullParameter(giveThemeModel2, "$giveThemeModel");
                        oO0OO00o binding = oo0oo00oInflate;
                        Intrinsics.checkNotNullParameter(binding, "$binding");
                        ShareToFriendsActivity this$0 = shareToFriendsActivity2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p650o0ooo.o000OO00 this_apply = o000oo01;
                        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                        o0oo0000.OooO00o.OooO0O0("105034");
                        String message = binding.f44905OooO0OO.getText().toString();
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
                        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new p412o0Oo0o0O.oOO00O(j2, shopId, message, mutableLiveData, themeBgName, themeBgImgUrl, themeVideoUrl, null), 2, null);
                        mutableLiveData.observe(this$0, new ShareToFriendsActivity.OooO0OO(new o0o0Oo(this$0)));
                        this_apply.OooO0O0();
                    }
                });
                o000oo01.OooO();
            }
        } else {
            int code = apiResult2.getError().getCode();
            p435o0OoOOOo.o0O000 o0o001 = p435o0OoOOOo.o0O000.f47005OooO00o;
            if (code == 1062) {
                kotlin.collections.unsigned.OooO0OO.OooO0O0(p435o0OoOOOo.o0O0o.He_Is_Not_Your_Friend, null, 2, null, o0o001);
            } else if (code != 2050) {
                ApiError error = apiResult2.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p381o0OOoOo0.Oooo000(error, null), 3, null);
            } else {
                kotlin.collections.unsigned.OooO0OO.OooO0O0(p435o0OoOOOo.o0O0o.Friend_Has_This_Theme, null, 2, null, o0o001);
            }
        }
        return Unit.INSTANCE;
    }
}
