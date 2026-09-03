package p486o0o00O00;

import OooO0OO.OooO0O0;
import android.app.Activity;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Observer;
import com.code.android.util.o0OoOo0;
import com.facebook.internal.AnalyticsEvents;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p140o00OOooo.OooOO0;
import p427o0OoOO00.o0OOO0o;
import p464o0Oooo.o000000O;
import p560o0oOo000.o00000O0;
import p560o0oOo000.o0000OO0;
import p579o0oOoo.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainActivity f48287OooO0Oo;

    public o000O0o(MainActivity mainActivity) {
        this.f48287OooO0Oo = mainActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strRemovePrefix;
        String queryParameter;
        String url;
        String queryParameter2;
        OooOOO0.OooO0OO("IntentScheme", "LiveEventBus it = " + obj);
        if (obj instanceof Uri) {
            Uri fixUri = (Uri) obj;
            MainActivity activity = this.f48287OooO0Oo;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(fixUri, "uri");
            OooOOO0.OooO0OO("IntentScheme", "parserIntentUri uri = " + fixUri);
            String scheme = fixUri.getScheme();
            if (scheme != null && ((StringsKt__StringsJVMKt.startsWith(scheme, "yalla", true) && Intrinsics.areEqual(fixUri.getHost(), "screen")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(fixUri.getHost(), "enterroom")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(fixUri.getHost(), "main")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(fixUri.getHost(), "account_binding")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(fixUri.getHost(), "start")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(fixUri.getHost(), "event")) || (StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(fixUri.getHost(), AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB))))))))) {
                if (!Intrinsics.areEqual(fixUri.getScheme(), "yalla")) {
                    fixUri = new Uri.Builder().scheme("yalla").authority("screen").path(fixUri.getHost()).appendQueryParameter("BarId", fixUri.getQueryParameter("BarId")).appendQueryParameter("eventID", fixUri.getQueryParameter("eventID")).appendQueryParameter("url", fixUri.getQueryParameter("url")).build();
                }
                Intrinsics.checkNotNullExpressionValue(fixUri, "fixUri");
                String scheme2 = fixUri.getScheme();
                String host = fixUri.getHost();
                String path = fixUri.getPath();
                String strOooO00o = OooOO0.OooO00o(fixUri.getQueryParameterNames());
                StringBuilder sb = new StringBuilder("intentJump uri = ");
                sb.append(fixUri);
                sb.append(", scheme = ");
                sb.append(scheme2);
                sb.append(", host = ");
                OooO0O0.OooO00o(sb, host, ", path = ", path, ", ParameterNames = ");
                sb.append(strOooO00o);
                sb.append(", } ");
                OooOOO0.OooO0OO("IntentScheme", sb.toString());
                String path2 = fixUri.getPath();
                if (path2 == null || (strRemovePrefix = StringsKt.removePrefix(path2, (CharSequence) "/")) == null) {
                    return;
                }
                switch (strRemovePrefix.hashCode()) {
                    case -1328717197:
                        if (strRemovePrefix.equals("account_binding")) {
                            oO00OOo0 onLogin = oO00OOo0.f56560OooO0Oo;
                            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                            o000000O o000000o2 = o000000O.f46674OooO00o;
                            if (!Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                                if (activityOooO0O0 != null) {
                                    int i = LoginActivity.f25186OooOo0O;
                                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                                }
                            } else {
                                onLogin.invoke();
                            }
                            break;
                        }
                        break;
                    case -857121869:
                        if (strRemovePrefix.equals("enterroom") && (queryParameter = fixUri.getQueryParameter("BarId")) != null) {
                            MutableState mutableState = o0OOO0o.f45698OooO00o;
                            o0OOO0o.OooO0o0(o0OoOo0.OooO(0L, queryParameter), EnterRoomParentPage.OtherApp_Room);
                        }
                        break;
                    case 117588:
                        if (strRemovePrefix.equals(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB) && (url = fixUri.getQueryParameter("url")) != null) {
                            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ExternalLink);
                            Intrinsics.checkNotNullParameter(url, "url");
                            webPageInfo.f32819OooO0o0 = url;
                            int i2 = WebActivity.f25584OooOoO0;
                            WebActivity.OooO00o.OooO00o(activity, webPageInfo);
                        }
                        break;
                    case 3343801:
                        if (strRemovePrefix.equals("main")) {
                            int i3 = MainActivity.f25394OooOoo;
                            MainActivity.OooO00o.OooO00o(activity, 0, 6);
                            break;
                        }
                        break;
                    case 96891546:
                        if (strRemovePrefix.equals("event") && (queryParameter2 = fixUri.getQueryParameter("eventID")) != null) {
                            EventModel eventModel = new EventModel();
                            eventModel.setId(o0OoOo0.OooO(0L, queryParameter2));
                            if (eventModel.getId() != 0) {
                                o00000O0 o00000o1 = o0000OO0.f56183OooO0O0;
                                if (o00000o1 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("event");
                                    o00000o1 = null;
                                }
                                o00000o1.OooO0o(eventModel);
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
}
