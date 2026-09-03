package p487o0o00O;

import OooO0OO.OooO0O0;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Observer;
import com.code.android.util.o0OoOo0;
import com.facebook.internal.AnalyticsEvents;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p187o00o00o0.OooO;
import p429o0OoOO.o0Oo0oo;
import p475o0Ooooo0.o0O00oO0;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o0OOO0o;
import p590o0oOooo0.oOOO0OOO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48743OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48744OooO0o0;

    public /* synthetic */ o000(Object obj, int i) {
        this.f48743OooO0Oo = i;
        this.f48744OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strRemovePrefix;
        String queryParameter;
        String url;
        String queryParameter2;
        int i = this.f48743OooO0Oo;
        Object obj2 = this.f48744OooO0o0;
        switch (i) {
            case 0:
                MainActivity context = (MainActivity) obj2;
                int i2 = MainActivity.f24940OooOoo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                o0000O00.OooO0OO("IntentScheme", "LiveEventBus it = " + obj);
                if (obj instanceof Uri) {
                    Uri uri = (Uri) obj;
                    Intrinsics.checkNotNullParameter(context, "activity");
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    o0000O00.OooO0OO("IntentScheme", "parserIntentUri uri = " + uri);
                    String scheme = uri.getScheme();
                    if (scheme != null && ((StringsKt__StringsJVMKt.startsWith(scheme, "yalla", true) && Intrinsics.areEqual(uri.getHost(), "screen")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(uri.getHost(), "enterroom")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(uri.getHost(), "main")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(uri.getHost(), "account_binding")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(uri.getHost(), "start")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(uri.getHost(), "event")) || (StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(uri.getHost(), AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB))))))))) {
                        if (!Intrinsics.areEqual(uri.getScheme(), "yalla")) {
                            uri = new Uri.Builder().scheme("yalla").authority("screen").path(uri.getHost()).appendQueryParameter("BarId", uri.getQueryParameter("BarId")).appendQueryParameter("eventID", uri.getQueryParameter("eventID")).appendQueryParameter("url", uri.getQueryParameter("url")).build();
                        }
                        Intrinsics.checkNotNull(uri);
                        String scheme2 = uri.getScheme();
                        String host = uri.getHost();
                        String path = uri.getPath();
                        String strOooO00o = OooO.OooO00o(uri.getQueryParameterNames());
                        StringBuilder sb = new StringBuilder("intentJump uri = ");
                        sb.append(uri);
                        sb.append(", scheme = ");
                        sb.append(scheme2);
                        sb.append(", host = ");
                        OooO0O0.OooO00o(sb, host, ", path = ", path, ", ParameterNames = ");
                        sb.append(strOooO00o);
                        sb.append(", } ");
                        o0000O00.OooO0OO("IntentScheme", sb.toString());
                        String path2 = uri.getPath();
                        if (path2 != null && (strRemovePrefix = StringsKt.removePrefix(path2, (CharSequence) "/")) != null) {
                            switch (strRemovePrefix.hashCode()) {
                                case -1328717197:
                                    if (strRemovePrefix.equals("account_binding")) {
                                        oOOO0OOO onLogin = oOOO0OOO.f57235OooO0Oo;
                                        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                                        if (!Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                                            Activity context2 = com.code.android.util.OooO0O0.OooO0O0();
                                            if (context2 != null) {
                                                Intrinsics.checkNotNullParameter(context2, "context");
                                                context2.startActivity(new Intent(context2, (Class<?>) LoginActivity.class));
                                            }
                                        } else {
                                            onLogin.invoke();
                                        }
                                        break;
                                    }
                                    break;
                                case -857121869:
                                    if (strRemovePrefix.equals("enterroom") && (queryParameter = uri.getQueryParameter("BarId")) != null) {
                                        MutableState mutableState = o0Oo0oo.f46817OooO00o;
                                        o0Oo0oo.OooO0o0(o0OoOo0.OooO(0L, queryParameter), EnterRoomParentPage.OtherApp_Room);
                                    }
                                    break;
                                case 117588:
                                    if (strRemovePrefix.equals(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB) && (url = uri.getQueryParameter("url")) != null) {
                                        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ExternalLink);
                                        Intrinsics.checkNotNullParameter(url, "url");
                                        webPageInfo.f32283OooO0o0 = url;
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                                        intent.putExtra("pageinfo", webPageInfo);
                                        context.startActivity(intent);
                                    }
                                    break;
                                case 3343801:
                                    if (strRemovePrefix.equals("main")) {
                                        MainActivity.OooO00o.OooO00o(context, 0, 6);
                                        break;
                                    }
                                    break;
                                case 96891546:
                                    if (strRemovePrefix.equals("event") && (queryParameter2 = uri.getQueryParameter("eventID")) != null) {
                                        EventModel eventModel = new EventModel();
                                        eventModel.setId(o0OoOo0.OooO(0L, queryParameter2));
                                        if (eventModel.getId() != 0) {
                                            o0OOO0o o0ooo0o2 = o00000OO.f56399OooO0O0;
                                            if (o0ooo0o2 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("event");
                                                o0ooo0o2 = null;
                                            }
                                            o0ooo0o2.OooO0o(eventModel);
                                            break;
                                        }
                                    }
                                    break;
                                case 109757538:
                                    strRemovePrefix.equals("start");
                                    break;
                            }
                        }
                    }
                }
                break;
            default:
                BaseMomentVM newMomentVM = (BaseMomentVM) obj2;
                MomentChangeUserIsInRoomModel it = (MomentChangeUserIsInRoomModel) obj;
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                Intrinsics.checkNotNullParameter(it, "it");
                newMomentVM.updateInRoom(it);
                break;
        }
    }
}
