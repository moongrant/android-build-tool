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
import p577o0oOoOo.o0OO000;
import p590o0oOooo0.c1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WebActivity f25152OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OO000 f25153OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(WebActivity webActivity, o0OO000 o0oo000) {
        super(0);
        this.f25152OooO0Oo = webActivity;
        this.f25153OooO0o0 = o0oo000;
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
        int i = WebActivity.f25130OooOoO0;
        WebActivity webActivity = this.f25152OooO0Oo;
        webActivity.OooOoO0().setShowDropdownMenu(false);
        WebPageInfo webPageInfo7 = webActivity.f25137OooOo0O;
        WebPageInfo webPageInfo8 = null;
        if (webPageInfo7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo7 = null;
        }
        if (webPageInfo7.f32281OooO0Oo == WebFrom.MomentActivityBanner) {
            z = true;
        } else {
            WebPageInfo webPageInfo9 = webActivity.f25137OooOo0O;
            if (webPageInfo9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo9 = null;
            }
            if (webPageInfo9.f32281OooO0Oo == WebFrom.RoomMainBanner) {
                z = true;
            } else {
                z = false;
            }
        }
        o0OO000 o0oo000 = this.f25153OooO0o0;
        if (z) {
            WebPageInfo webPageInfo10 = webActivity.f25137OooOo0O;
            if (webPageInfo10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo8 = webPageInfo10;
            }
            o0oo000.getClass();
            Intrinsics.checkNotNullParameter(webPageInfo8, "webPageInfo");
            ShareContentModel shareContentModel = new ShareContentModel(ShareContentType.Web);
            ShareWebModel shareWebModel = new ShareWebModel();
            shareWebModel.setWebFrom(webPageInfo8.f32281OooO0Oo);
            shareWebModel.setTitle(webPageInfo8.f32284OooO0oO);
            shareWebModel.setContent(webPageInfo8.f32290OooOOO0);
            shareWebModel.setUrl(webPageInfo8.f32283OooO0o0);
            shareWebModel.setImagesUrl(webPageInfo8.f32288OooOO0o);
            LinkedHashMap linkedHashMap = webPageInfo8.f32286OooOO0;
            shareWebModel.setId((String) linkedHashMap.get("barId"));
            shareWebModel.setIdx((String) linkedHashMap.get("barId"));
            shareContentModel.setWeb(shareWebModel);
            o0oo000.f56515OooO0O0.setValue(shareContentModel);
            Boolean bool = Boolean.TRUE;
            o0oo000.f56516OooO0OO.setValue(bool);
            o0oo000.f56517OooO0Oo.setValue(bool);
            o0oo000.f56519OooO0o0.setValue(bool);
            o0oo000.f56514OooO00o.setValue(bool);
        } else {
            ShareContentModel shareContentModel2 = new ShareContentModel(ShareContentType.Room);
            BaseWebView2 baseWebView2 = webActivity.f25138OooOo0o;
            String title2 = baseWebView2 != null ? baseWebView2.getTitle() : null;
            if (title2 == null || StringsKt.isBlank(title2)) {
                WebPageInfo webPageInfo11 = webActivity.f25137OooOo0O;
                if (webPageInfo11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo11 = null;
                }
                title = webPageInfo11.f32284OooO0oO;
            } else {
                BaseWebView2 baseWebView3 = webActivity.f25138OooOo0o;
                if (baseWebView3 != null) {
                    title = baseWebView3.getTitle();
                } else {
                    str = null;
                }
                webPageInfo = webActivity.f25137OooOo0O;
                if (webPageInfo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo = null;
                }
                String str2 = webPageInfo.f32290OooOOO0;
                webPageInfo2 = webActivity.f25137OooOo0O;
                if (webPageInfo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo2 = null;
                }
                String strOooO00o = c1.OooO00o(webPageInfo2.f32283OooO0o0);
                webPageInfo3 = webActivity.f25137OooOo0O;
                if (webPageInfo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo3 = null;
                }
                String str3 = webPageInfo3.f32288OooOO0o;
                webPageInfo4 = webActivity.f25137OooOo0O;
                if (webPageInfo4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo4 = null;
                }
                String str4 = (String) webPageInfo4.f32286OooOO0.get("roomid");
                webPageInfo5 = webActivity.f25137OooOo0O;
                if (webPageInfo5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo5 = null;
                }
                String str5 = (String) webPageInfo5.f32286OooOO0.get("roomid");
                webPageInfo6 = webActivity.f25137OooOo0O;
                if (webPageInfo6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                } else {
                    webPageInfo8 = webPageInfo6;
                }
                shareContentModel2.setRoom(new RoomShareModel(str, str2, strOooO00o, str3, str4, str5, webPageInfo8.f32281OooO0Oo.getValue()));
                o0oo000.f56515OooO0O0.setValue(shareContentModel2);
            }
            str = title;
            webPageInfo = webActivity.f25137OooOo0O;
            if (webPageInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo = null;
            }
            String str6 = webPageInfo.f32290OooOOO0;
            webPageInfo2 = webActivity.f25137OooOo0O;
            if (webPageInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo2 = null;
            }
            String strOooO00o2 = c1.OooO00o(webPageInfo2.f32283OooO0o0);
            webPageInfo3 = webActivity.f25137OooOo0O;
            if (webPageInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo3 = null;
            }
            String str7 = webPageInfo3.f32288OooOO0o;
            webPageInfo4 = webActivity.f25137OooOo0O;
            if (webPageInfo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo4 = null;
            }
            String str8 = (String) webPageInfo4.f32286OooOO0.get("roomid");
            webPageInfo5 = webActivity.f25137OooOo0O;
            if (webPageInfo5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo5 = null;
            }
            String str9 = (String) webPageInfo5.f32286OooOO0.get("roomid");
            webPageInfo6 = webActivity.f25137OooOo0O;
            if (webPageInfo6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo8 = webPageInfo6;
            }
            shareContentModel2.setRoom(new RoomShareModel(str, str6, strOooO00o2, str7, str8, str9, webPageInfo8.f32281OooO0Oo.getValue()));
            o0oo000.f56515OooO0O0.setValue(shareContentModel2);
        }
        o0oo000.f56514OooO00o.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
