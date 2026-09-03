package com.yalla.yalla.ui.activity.main;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareWebModel;
import com.yalla.yalla.ui.view.pop.roomSharePop.RoomShareModel;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import com.yalla.yalla.util.WebPageInfo;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p571o0oOoOO.o0O0o000;
import p579o0oOoo.oOo0o00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WebActivity f25607OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0o000 f25608OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(WebActivity webActivity, o0O0o000 o0o0o000) {
        super(0);
        this.f25607OooO0Oo = webActivity;
        this.f25608OooO0o0 = o0o0o000;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z;
        String str;
        String title;
        WebPageInfo webPageInfo;
        WebPageInfo webPageInfo2;
        WebPageInfo webPageInfo3;
        WebPageInfo webPageInfo4;
        WebPageInfo webPageInfo5;
        WebPageInfo webPageInfo6;
        int i = WebActivity.f25584OooOoO0;
        WebActivity webActivity = this.f25607OooO0Oo;
        webActivity.OooOoO0().setShowDropdownMenu(false);
        WebPageInfo webPageInfo7 = webActivity.f25591OooOo0O;
        WebPageInfo webPageInfo8 = null;
        if (webPageInfo7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo7 = null;
        }
        if (webPageInfo7.f32817OooO0Oo == WebFrom.MomentActivityBanner) {
            z = true;
        } else {
            WebPageInfo webPageInfo9 = webActivity.f25591OooOo0O;
            if (webPageInfo9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo9 = null;
            }
            if (webPageInfo9.f32817OooO0Oo == WebFrom.RoomMainBanner) {
                z = true;
            } else {
                z = false;
            }
        }
        o0O0o000 o0o0o000 = this.f25608OooO0o0;
        if (z) {
            WebPageInfo webPageInfo10 = webActivity.f25591OooOo0O;
            if (webPageInfo10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo8 = webPageInfo10;
            }
            o0o0o000.getClass();
            Intrinsics.checkNotNullParameter(webPageInfo8, "webPageInfo");
            ShareContentModel shareContentModel = new ShareContentModel(ShareContentType.Web);
            ShareWebModel shareWebModel = new ShareWebModel();
            shareWebModel.setWebFrom(webPageInfo8.f32817OooO0Oo);
            shareWebModel.setTitle(webPageInfo8.f32820OooO0oO);
            shareWebModel.setContent(webPageInfo8.f32826OooOOO0);
            shareWebModel.setUrl(webPageInfo8.f32819OooO0o0);
            shareWebModel.setImagesUrl(webPageInfo8.f32824OooOO0o);
            LinkedHashMap linkedHashMap = webPageInfo8.f32822OooOO0;
            shareWebModel.setId((String) linkedHashMap.get("barId"));
            shareWebModel.setIdx((String) linkedHashMap.get("barId"));
            shareContentModel.setWeb(shareWebModel);
            o0o0o000.f56248OooO0O0.setValue(shareContentModel);
            Boolean bool = Boolean.TRUE;
            o0o0o000.f56249OooO0OO.setValue(bool);
            o0o0o000.f56250OooO0Oo.setValue(bool);
            o0o0o000.f56252OooO0o0.setValue(bool);
            o0o0o000.f56247OooO00o.setValue(bool);
        } else {
            ShareContentModel shareContentModel2 = new ShareContentModel(ShareContentType.Room);
            BaseWebView2 baseWebView2 = webActivity.f25592OooOo0o;
            String title2 = baseWebView2 != null ? baseWebView2.getTitle() : null;
            if (title2 == null || StringsKt.isBlank(title2)) {
                WebPageInfo webPageInfo11 = webActivity.f25591OooOo0O;
                if (webPageInfo11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo11 = null;
                }
                title = webPageInfo11.f32820OooO0oO;
            } else {
                BaseWebView2 baseWebView3 = webActivity.f25592OooOo0o;
                if (baseWebView3 != null) {
                    title = baseWebView3.getTitle();
                } else {
                    str = null;
                }
                webPageInfo = webActivity.f25591OooOo0O;
                if (webPageInfo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo = null;
                }
                String str2 = webPageInfo.f32826OooOOO0;
                webPageInfo2 = webActivity.f25591OooOo0O;
                if (webPageInfo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo2 = null;
                }
                String strOooO00o = oOo0o00.OooO00o(webPageInfo2.f32819OooO0o0);
                webPageInfo3 = webActivity.f25591OooOo0O;
                if (webPageInfo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo3 = null;
                }
                String str3 = webPageInfo3.f32824OooOO0o;
                webPageInfo4 = webActivity.f25591OooOo0O;
                if (webPageInfo4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo4 = null;
                }
                String str4 = (String) webPageInfo4.f32822OooOO0.get("roomid");
                webPageInfo5 = webActivity.f25591OooOo0O;
                if (webPageInfo5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo5 = null;
                }
                String str5 = (String) webPageInfo5.f32822OooOO0.get("roomid");
                webPageInfo6 = webActivity.f25591OooOo0O;
                if (webPageInfo6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                } else {
                    webPageInfo8 = webPageInfo6;
                }
                shareContentModel2.setRoom(new RoomShareModel(str, str2, strOooO00o, str3, str4, str5, webPageInfo8.f32817OooO0Oo.getValue()));
                o0o0o000.f56248OooO0O0.setValue(shareContentModel2);
            }
            str = title;
            webPageInfo = webActivity.f25591OooOo0O;
            if (webPageInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo = null;
            }
            String str6 = webPageInfo.f32826OooOOO0;
            webPageInfo2 = webActivity.f25591OooOo0O;
            if (webPageInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo2 = null;
            }
            String strOooO00o2 = oOo0o00.OooO00o(webPageInfo2.f32819OooO0o0);
            webPageInfo3 = webActivity.f25591OooOo0O;
            if (webPageInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo3 = null;
            }
            String str7 = webPageInfo3.f32824OooOO0o;
            webPageInfo4 = webActivity.f25591OooOo0O;
            if (webPageInfo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo4 = null;
            }
            String str8 = (String) webPageInfo4.f32822OooOO0.get("roomid");
            webPageInfo5 = webActivity.f25591OooOo0O;
            if (webPageInfo5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo5 = null;
            }
            String str9 = (String) webPageInfo5.f32822OooOO0.get("roomid");
            webPageInfo6 = webActivity.f25591OooOo0O;
            if (webPageInfo6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo8 = webPageInfo6;
            }
            shareContentModel2.setRoom(new RoomShareModel(str, str6, strOooO00o2, str7, str8, str9, webPageInfo8.f32817OooO0Oo.getValue()));
            o0o0o000.f56248OooO0O0.setValue(shareContentModel2);
        }
        o0o0o000.f56247OooO00o.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
