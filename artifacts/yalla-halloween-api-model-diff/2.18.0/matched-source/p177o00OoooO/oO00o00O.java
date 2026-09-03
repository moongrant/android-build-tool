package p177o00OoooO;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.model.BadgeBannerModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.StartActivity;
import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import com.yalla.yalla.ui.fragment.RoomThemeMineFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import com.yalla.yalla.ui.screen.event.EventDetailScreen;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import o00OO0O0.o0OOO0o;
import oO0OO.o00Ooo;
import p074o000O0oo.OooOOO;
import p189o00o00o0.OooO0OO;
import p255o00ooO0O.o00000O;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p532o0o0OOO.o00OO0O0;
import p586o0oOoo.o000O;
import p619o0oo0o.o00000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO00o00O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32856OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32857OooO0O0;

    public /* synthetic */ oO00o00O(Object obj, int i) {
        this.f32856OooO00o = i;
        this.f32857OooO0O0 = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String host;
        String queryParameter;
        String queryParameter2;
        boolean z = true;
        OooO0OO<BadgeBannerModel> oooO0OO = null;
        switch (this.f32856OooO00o) {
            case 0:
                Function1 sendResultListener = (Function1) this.f32857OooO0O0;
                Boolean result = (Boolean) obj;
                Intrinsics.checkNotNullParameter(sendResultListener, "$sendResultListener");
                Intrinsics.checkNotNullExpressionValue(result, "result");
                if (result.booleanValue()) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.send_successfully);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                }
                sendResultListener.invoke(result);
                break;
            case 1:
                o00Ooo this$0 = (o00Ooo) this.f32857OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f52766OooO0Oo) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str != null) {
                        if (!(!StringsKt.isBlank(str))) {
                            Function0<Unit> function0 = this$0.f52765OooO0OO;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            Function1<? super String, Unit> function1 = this$0.f52764OooO0O0;
                            if (function1 != null) {
                                function1.invoke(str);
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                MainActivity context = (MainActivity) this.f32857OooO0O0;
                MainActivity.OooO00o oooO00o = MainActivity.f21962o00Ooo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (obj instanceof Uri) {
                    Uri uri = (Uri) obj;
                    Intrinsics.checkNotNullParameter(context, "activity");
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    String scheme = uri.getScheme();
                    if (scheme == null || (!StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && !StringsKt__StringsJVMKt.startsWith(scheme, "http://", true))) {
                        z = false;
                    }
                    if (z && (host = uri.getHost()) != null) {
                        switch (host.hashCode()) {
                            case -1328717197:
                                if (host.equals("account_binding")) {
                                    o00000 onLogin = new o00000(context);
                                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                                    if (!Intrinsics.areEqual(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                                        Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
                                        if (activityOooO0O0 != null) {
                                            o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                                        }
                                    } else {
                                        onLogin.invoke();
                                    }
                                    break;
                                }
                                break;
                            case -857121869:
                                if (host.equals("enterroom") && (queryParameter = uri.getQueryParameter("BarId")) != null) {
                                    RoomStateManager.INSTANCE.enterRoom(OooO.OooO0oO(queryParameter), EnterRoomParentPage.OtherApp_Room);
                                }
                                break;
                            case 3343801:
                                if (host.equals("main")) {
                                    MainActivity.OooO00o oooO00o2 = MainActivity.f21962o00Ooo;
                                    MainActivity.OooO00o.OooO00o(context, false, 0, 24);
                                    break;
                                }
                                break;
                            case 96891546:
                                if (host.equals("event") && (queryParameter2 = uri.getQueryParameter("eventID")) != null) {
                                    long jOooO0oO = OooO.OooO0oO(queryParameter2);
                                    if (jOooO0oO != 0) {
                                        EventModel model = new EventModel();
                                        model.setId(jOooO0oO);
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Bundle bundleOooO00o = o000O00O.OooO0OO.OooO00o();
                                        bundleOooO00o.putSerializable("key", model);
                                        o000O.OooO00o(EventDetailScreen.f24587OooO00o, bundleOooO00o);
                                        break;
                                    }
                                }
                                break;
                            case 109757538:
                                if (host.equals("start")) {
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    context.startActivity(new Intent(context, (Class<?>) StartActivity.class));
                                    break;
                                }
                                break;
                        }
                    }
                }
                break;
            case 3:
                TopicCreateActivity this$1 = (TopicCreateActivity) this.f32857OooO0O0;
                String it = (String) obj;
                int i = TopicCreateActivity.f22568Oooooo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoo().f50826OooO0OO.f50907OooO0OO.setText(it);
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (!(!StringsKt.isBlank(it))) {
                    this$1.OooOoo().f50826OooO0OO.f50907OooO0OO.setHint(R.string.create_topic_description_hint);
                } else {
                    this$1.OooOoo().f50826OooO0OO.f50907OooO0OO.setHint("");
                }
                break;
            case 4:
                BadgeActivity this$2 = (BadgeActivity) this.f32857OooO0O0;
                List<BadgeBannerModel> list = (List) obj;
                BadgeActivity.OooO00o oooO00o3 = BadgeActivity.f23302OoooooO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                OooO0OO<BadgeBannerModel> oooO0OO2 = this$2.f23305OooooOo;
                if (oooO0OO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0OO = oooO0OO2;
                }
                oooO0OO.setNewData(list);
                break;
            case 5:
                RoomGameBoxDialog this$3 = (RoomGameBoxDialog) this.f32857OooO0O0;
                Boolean it2 = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Integer value = o00OO0O0.f43338OooooOo.OooO00o().f43354OooOOOO.getValue();
                if (value != null && value.intValue() == 2) {
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    this$3.f23771OooOOO0 = it2.booleanValue();
                    this$3.OooOOOO(true, RoomGameBoxDialog.GameType.GameLuckyNumber);
                }
                break;
            case 6:
                MainExploreFragment.m338initObserver$lambda9((MainExploreFragment) this.f32857OooO0O0, (Pair) obj);
                break;
            case 7:
                RoomThemeMineFragment.m397initView$lambda0((RoomThemeMineFragment) this.f32857OooO0O0, obj);
                break;
            default:
                MainRoomMineFollowingFragment.m464onLazyInit$lambda1((MainRoomMineFollowingFragment) this.f32857OooO0O0, obj);
                break;
        }
    }
}
