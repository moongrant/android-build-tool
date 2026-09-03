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
import com.code.android.videoplayer.view.VideoView;
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
import p406o0Oo0Ooo.oOO0O0O;
import p406o0Oo0Ooo.oo000000;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.z4;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOOo extends Lambda implements Function1<ApiResult<RoomThemeGiveInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25906OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f25907OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f25908OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f25909OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ GiveThemeModel f25910OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOOo(ShareToFriendsActivity shareToFriendsActivity, String str, long j, String str2, GiveThemeModel giveThemeModel) {
        super(1);
        this.f25906OooO0Oo = shareToFriendsActivity;
        this.f25908OooO0o0 = str;
        this.f25907OooO0o = j;
        this.f25909OooO0oO = str2;
        this.f25910OooO0oo = giveThemeModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RoomThemeGiveInfo> apiResult) {
        String dynamicUrl;
        String picUrl;
        ApiResult<RoomThemeGiveInfo> apiResult2 = apiResult;
        ShareToFriendsActivity shareToFriendsActivity = this.f25906OooO0Oo;
        shareToFriendsActivity.OooOo0();
        if (apiResult2.isSuccess()) {
            RoomThemeGiveInfo data = apiResult2.getData();
            if (data != null) {
                final p519o0o0O0oO.o00O00OO o00o00oo2 = new p519o0o0O0oO.o00O00OO(shareToFriendsActivity, 0);
                final ShareToFriendsActivity shareToFriendsActivity2 = this.f25906OooO0Oo;
                final long j = this.f25907OooO0o;
                final GiveThemeModel giveThemeModel = this.f25910OooO0oo;
                final z4 z4VarInflate = z4.inflate(LayoutInflater.from(o00o00oo2.f52532OooO0Oo), o00o00oo2.f52533OooO0o, true);
                Intrinsics.checkNotNullExpressionValue(z4VarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
                z4VarInflate.f59441OooO00o.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.activity.message.o00OO
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        z4 binding = z4VarInflate;
                        Intrinsics.checkNotNullParameter(binding, "$binding");
                        EditText view2 = binding.f59443OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(view2, "binding.etMessage");
                        Intrinsics.checkNotNullParameter(view2, "view");
                        Context context = view2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "view.context");
                        InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
                        p367o0OOo0o0.OooOO0O.OooO00o(view2.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view2.getWindowToken(), 0);
                        return false;
                    }
                });
                o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(shareToFriendsActivity2);
                oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                String str = (String) p464o0Oooo.o000000O.OooO().getValue();
                float f = 46;
                int iOooO00o = com.code.android.util.o0000O0.OooO00o(f);
                oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o, iOooO00o, str);
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO0Oo(z4VarInflate.f59446OooO0o0);
                z4VarInflate.f59448OooO0oo.setText((CharSequence) p464o0Oooo.o000000O.OooOOoo().getValue());
                o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(shareToFriendsActivity2);
                oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                int iOooO00o2 = com.code.android.util.o0000O0.OooO00o(f);
                oooO00o2.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o2, iOooO00o2, this.f25908OooO0o0);
                oooO00o2.f43909OooO00o = 0;
                oooO00o2.OooO0Oo(z4VarInflate.f59447OooO0oO);
                z4VarInflate.f59453OooOOO0.setText(oOO0O0O.OooO0O0(j, this.f25909OooO0oO));
                RoomThemeGiveInfo data2 = apiResult2.getData();
                if (data2 == null || (dynamicUrl = data2.getDynamicUrl()) == null) {
                    dynamicUrl = "";
                }
                boolean zIsBlank = true ^ StringsKt.isBlank(dynamicUrl);
                NetImageView netImageView = z4VarInflate.f59445OooO0o;
                VideoView videoPlayer = z4VarInflate.f59452OooOOO;
                if (zIsBlank) {
                    Intrinsics.checkNotNullExpressionValue(videoPlayer, "binding.videoView");
                    com.code.android.util.o000OO00.OooOOOO(videoPlayer);
                    Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivShop");
                    com.code.android.util.o000OO00.OooO0O0(netImageView);
                    p152o00OoO.OooOO0 oooOO1 = new p152o00OoO.OooOO0();
                    shareToFriendsActivity2.f25741OooOoo0.add(oooOO1);
                    Intrinsics.checkNotNullExpressionValue(videoPlayer, "binding.videoView");
                    Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
                    oooOO1.f38118OooO00o = videoPlayer;
                    File file = p402o0Oo0OOO.o00O000.f44470OooO00o;
                    p402o0Oo0OOO.o00O000.OooO00o(dynamicUrl).observe(o00o00oo2.f52534OooO0o0, new ShareToFriendsActivity.OooO0OO(new o00OOO0O(o00o00oo2, oooOO1)));
                    videoPlayer.setStateChangedListener(new o0o0Oo(z4VarInflate));
                } else {
                    Intrinsics.checkNotNullExpressionValue(videoPlayer, "binding.videoView");
                    com.code.android.util.o000OO00.OooO0O0(videoPlayer);
                    Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivShop");
                    com.code.android.util.o000OO00.OooOOOO(netImageView);
                    o0OOo0O.OooOO0.OooO00o oooO00o3 = new o0OOo0O.OooOO0.OooO00o(shareToFriendsActivity2);
                    RoomThemeGiveInfo data3 = apiResult2.getData();
                    oooO00o3.f43911OooO0OO = (data3 == null || (picUrl = data3.getPicUrl()) == null) ? null : p139o00OOooO.OooO0o.OooO0oo(com.code.android.util.o0000O0.OooO00o(92), com.code.android.util.o0000O0.OooO00o(115), picUrl);
                    oooO00o3.f43909OooO00o = 0;
                    oooO00o3.f43936OooOoo0 = 2;
                    oooO00o3.f43926OooOOoo = 3;
                    oooO00o3.f43923OooOOOo = oOo00OO0.icon_room_theme_placeholder;
                    oooO00o3.OooO0o0(6);
                    oooO00o3.OooO0Oo(netImageView);
                }
                z4VarInflate.f59450OooOO0O.setText(data.getThemeName());
                z4VarInflate.f59440OooO.setText(String.valueOf(data.getPrice()));
                o00o00oo2.OooO0o(false);
                int timeLong = data.getTimeLong();
                TextView textView = z4VarInflate.f59451OooOO0o;
                if (timeLong > 0) {
                    textView.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_send_theme_limit_day), String.valueOf(data.getTimeLong())));
                } else {
                    textView.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_send_theme_permanent));
                }
                z4VarInflate.f59449OooOO0.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_send_theme_limit_count), String.valueOf(data.getGiveCount())));
                z4VarInflate.f59444OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.message.o00OOO00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        p519o0o0O0oO.o00O00OO this_apply = o00o00oo2;
                        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                        this_apply.OooO0O0();
                    }
                });
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.message_send_theme_confirm);
                StateButton stateButton = z4VarInflate.f59442OooO0O0;
                stateButton.setText(strOooO0OO);
                stateButton.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.message.o00OOO0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        long j2 = j;
                        GiveThemeModel giveThemeModel2 = giveThemeModel;
                        Intrinsics.checkNotNullParameter(giveThemeModel2, "$giveThemeModel");
                        z4 binding = z4VarInflate;
                        Intrinsics.checkNotNullParameter(binding, "$binding");
                        ShareToFriendsActivity this$0 = shareToFriendsActivity2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p519o0o0O0oO.o00O00OO this_apply = o00o00oo2;
                        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                        p587o0oOooo.o0OO000.OooO00o("105034");
                        String message = binding.f59443OooO0OO.getText().toString();
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
                        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new oo000000(j2, shopId, message, mutableLiveData, themeBgName, themeBgImgUrl, themeVideoUrl, null), 2, null);
                        mutableLiveData.observe(this$0, new ShareToFriendsActivity.OooO0OO(new o00OOOO0(this$0)));
                        this_apply.OooO0O0();
                    }
                });
                o00o00oo2.OooO();
            }
        } else {
            int code = apiResult2.getError().getCode();
            p429o0OoOOO.o00O0 o00o1 = p429o0OoOOO.o00O0.f45732OooO00o;
            if (code == 1062) {
                androidx.compose.animation.OooO.OooO0O0(p429o0OoOOO.oOO00O.He_Is_Not_Your_Friend, null, 2, null, o00o1);
            } else if (code != 2050) {
                ApiError error = apiResult2.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p375o0OOoOO.o00000O0(error, null), 3, null);
            } else {
                androidx.compose.animation.OooO.OooO0O0(p429o0OoOOO.oOO00O.Friend_Has_This_Theme, null, 2, null, o00o1);
            }
        }
        return Unit.INSTANCE;
    }
}
