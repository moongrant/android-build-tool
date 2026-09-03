package p543o0o0OoO0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.code.android.util.o0000;
import com.facebook.share.internal.ShareConstants;
import com.twitter.sdk.android.core.OooO0OO;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.o00O0O;
import com.twitter.sdk.android.core.o00Ooo;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareWebModel;
import com.yalla.yalla.ui.activity.BaseAppCompatActivity;
import com.yalla.yalla.ui.view.pop.roomSharePop.RoomShareModel;
import com.yalla.yalla.ui.vm.ShareLogViewModel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;
import p142o00OOooo.OooOo;
import p388o0OOooO.oo0o0Oo;
import p395o0Oo.oo000o;
import p416o0Oo0oO.oO000Oo0;
import p417o0Oo0oO0.o00Oo0;
import p468o0OooOoo.o0oOo0O0;
import p565o0oOo000.o000OOo;
import p676oOooo0o.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f54882OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ShareLogViewModel f54883OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f54884OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f54885OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f54886OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareContentType.values().length];
            try {
                iArr[ShareContentType.Room.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareContentType.Web.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareContentType.WebH5Content.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareContentType.Events.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f54888OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f54889OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ShareContentModel f54890OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f54891OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, String str2, ShareContentModel shareContentModel, String str3) {
            super(1);
            this.f54889OooO0o0 = str;
            this.f54888OooO0o = str2;
            this.f54890OooO0oO = shareContentModel;
            this.f54891OooO0oo = str3;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0047  */
        /* JADX WARN: Code duplicated, block: B:28:0x004d  */
        /* JADX WARN: Code duplicated, block: B:31:0x0065  */
        /* JADX WARN: Code duplicated, block: B:35:0x006e  */
        /* JADX WARN: Code duplicated, block: B:37:0x0071  */
        /* JADX WARN: Code duplicated, block: B:39:0x0076  */
        /* JADX WARN: Code duplicated, block: B:43:0x007f  */
        /* JADX WARN: Code duplicated, block: B:45:0x0082  */
        /* JADX WARN: Code duplicated, block: B:47:0x0088  */
        /* JADX WARN: Code duplicated, block: B:48:0x008a  */
        /* JADX WARN: Code duplicated, block: B:50:0x008d  */
        /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:58:0x00af  */
        /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:64:0x00de  */
        /* JADX WARN: Code duplicated, block: B:69:0x00fc A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:70:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:75:0x00f5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x00f9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:? A[LOOP:0: B:62:0x00d8->B:77:?, LOOP_END, SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            FragmentActivity fragmentActivity;
            Intent intent;
            StringBuilder sb;
            boolean z;
            boolean z2;
            boolean z3;
            Iterator<ResolveInfo> it;
            String packageName;
            String str2;
            boolean z4;
            String imagePath = str;
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            ShareContentModel shareContentModel = this.f54890OooO0oO;
            String str3 = this.f54891OooO0oo;
            o0O000Oo o0o000oo2 = o0O000Oo.this;
            o0O000o0 o0o000o1 = new o0O000o0(o0o000oo2, shareContentModel, str3);
            o0o000oo2.getClass();
            String str4 = this.f54889OooO0o0;
            boolean z5 = str4 == null || str4.length() == 0;
            String str5 = this.f54888OooO0o;
            if (z5) {
                if (imagePath == null || imagePath.length() == 0) {
                    if (!(str5 == null || str5.length() == 0)) {
                        fragmentActivity = o0o000oo2.f54882OooO00o;
                        if (fragmentActivity instanceof BaseAppCompatActivity) {
                            ((BaseAppCompatActivity) fragmentActivity).f24685OooO0o0 = new o0O00(o0o000oo2);
                        }
                        intent = new Intent("android.intent.action.SEND");
                        sb = new StringBuilder();
                        if (str4 != null) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            sb.append(str4);
                        }
                        if (str5 != null) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (!z2) {
                            if (sb.length() > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                sb.append(' ');
                            }
                            sb.append(str5);
                        }
                        intent.putExtra("android.intent.extra.TEXT", sb.toString());
                        intent.setType("text/plain");
                        if (imagePath != null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            intent.putExtra("android.intent.extra.STREAM", Uri.parse(imagePath));
                            intent.setType("image/jpeg");
                        }
                        PackageManager packageManager = fragmentActivity.getPackageManager();
                        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
                        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
                        it = listQueryIntentActivities.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                intent = null;
                                break;
                            }
                            packageName = it.next().activityInfo.packageName;
                            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                            str2 = o0o000oo2.f54884OooO0OO;
                            if (StringsKt.Oooo00o(packageName, str2)) {
                                intent.setPackage(str2);
                                break;
                            }
                        }
                        if (intent == null) {
                            if (str5 == null) {
                                str5 = "";
                            }
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str6 = String.format(o0o000oo2.f54885OooO0Oo, Arrays.copyOf(new Object[]{OooOo.OooO0o(str4), OooOo.OooO0o(str5)}, 2));
                            Intrinsics.checkNotNullExpressionValue(str6, "format(format, *args)");
                            intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                        }
                        fragmentActivity.startActivityForResult(intent, o0o000oo2.f54886OooO0o0);
                        o0o000o1.invoke();
                    }
                } else {
                    fragmentActivity = o0o000oo2.f54882OooO00o;
                    if (fragmentActivity instanceof BaseAppCompatActivity) {
                        ((BaseAppCompatActivity) fragmentActivity).f24685OooO0o0 = new o0O00(o0o000oo2);
                    }
                    intent = new Intent("android.intent.action.SEND");
                    sb = new StringBuilder();
                    if (str4 != null) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        sb.append(str4);
                    }
                    if (str5 != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        if (sb.length() > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            sb.append(' ');
                        }
                        sb.append(str5);
                    }
                    intent.putExtra("android.intent.extra.TEXT", sb.toString());
                    intent.setType("text/plain");
                    if (imagePath != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        intent.putExtra("android.intent.extra.STREAM", Uri.parse(imagePath));
                        intent.setType("image/jpeg");
                    }
                    PackageManager packageManager2 = fragmentActivity.getPackageManager();
                    Intrinsics.checkNotNullExpressionValue(packageManager2, "getPackageManager(...)");
                    List<ResolveInfo> listQueryIntentActivities2 = packageManager2.queryIntentActivities(intent, 65536);
                    Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities2, "queryIntentActivities(...)");
                    it = listQueryIntentActivities2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            intent = null;
                            break;
                        }
                        packageName = it.next().activityInfo.packageName;
                        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                        str2 = o0o000oo2.f54884OooO0OO;
                        if (StringsKt.Oooo00o(packageName, str2)) {
                            intent.setPackage(str2);
                            break;
                        }
                    }
                    if (intent == null) {
                        if (str5 == null) {
                            str5 = "";
                        }
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        String str7 = String.format(o0o000oo2.f54885OooO0Oo, Arrays.copyOf(new Object[]{OooOo.OooO0o(str4), OooOo.OooO0o(str5)}, 2));
                        Intrinsics.checkNotNullExpressionValue(str7, "format(format, *args)");
                        intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                    }
                    fragmentActivity.startActivityForResult(intent, o0o000oo2.f54886OooO0o0);
                    o0o000o1.invoke();
                }
            } else {
                fragmentActivity = o0o000oo2.f54882OooO00o;
                if (fragmentActivity instanceof BaseAppCompatActivity) {
                    ((BaseAppCompatActivity) fragmentActivity).f24685OooO0o0 = new o0O00(o0o000oo2);
                }
                intent = new Intent("android.intent.action.SEND");
                sb = new StringBuilder();
                if (str4 != null || str4.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    sb.append(str4);
                }
                if (str5 != null || str5.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (sb.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        sb.append(' ');
                    }
                    sb.append(str5);
                }
                intent.putExtra("android.intent.extra.TEXT", sb.toString());
                intent.setType("text/plain");
                if (imagePath != null || StringsKt.isBlank(imagePath)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.parse(imagePath));
                    intent.setType("image/jpeg");
                }
                PackageManager packageManager3 = fragmentActivity.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager3, "getPackageManager(...)");
                List<ResolveInfo> listQueryIntentActivities3 = packageManager3.queryIntentActivities(intent, 65536);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities3, "queryIntentActivities(...)");
                it = listQueryIntentActivities3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        intent = null;
                        break;
                    }
                    packageName = it.next().activityInfo.packageName;
                    Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                    str2 = o0o000oo2.f54884OooO0OO;
                    if (StringsKt.Oooo00o(packageName, str2)) {
                        intent.setPackage(str2);
                        break;
                    }
                }
                if (intent == null) {
                    if (str5 == null) {
                        str5 = "";
                    }
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    String str8 = String.format(o0o000oo2.f54885OooO0Oo, Arrays.copyOf(new Object[]{OooOo.OooO0o(str4), OooOo.OooO0o(str5)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str8, "format(format, *args)");
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(str8));
                }
                fragmentActivity.startActivityForResult(intent, o0o000oo2.f54886OooO0o0);
                o0o000o1.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public o0O000Oo(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f54882OooO00o = activity;
        this.f54883OooO0O0 = (ShareLogViewModel) new ViewModelProvider(activity).get(ShareLogViewModel.class);
        this.f54884OooO0OO = "com.twitter.android";
        this.f54885OooO0Oo = "https://twitter.com/intent/tweet?text=%s&url=%s";
        this.f54886OooO0o0 = 1702;
        if (activity == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        Context applicationContext = activity.getApplicationContext();
        OooO0OO oooO0OO = new OooO0OO(0);
        oO000Oo0 oo000oo0OooO0o = o00Oo0.OooO0o();
        oo000oo0OooO0o.getClass();
        String strOooO0o0 = oo000oo0OooO0o.OooO0o0(String.valueOf(-59014420), o0000.OooO0OO(o000OOo.single_twitter_key));
        oO000Oo0 oo000oo0OooO0o2 = o00Oo0.OooO0o();
        oo000oo0OooO0o2.getClass();
        o00Ooo o00ooo2 = new o00Ooo(applicationContext, oooO0OO, new TwitterAuthConfig(strOooO0o0, oo000oo0OooO0o2.OooO0o0(String.valueOf(-1228471549), o0000.OooO0OO(o000OOo.single_twitter_secret))), Boolean.valueOf(!oo0o0Oo.OooO0o0()));
        synchronized (o00O0O.class) {
            if (o00O0O.f21742OooO0oo == null) {
                o00O0O.f21742OooO0oo = new o00O0O(o00ooo2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0130  */
    /* JADX WARN: Code duplicated, block: B:90:0x0136  */
    public final void OooO00o(@Nullable ShareContentModel shareContentModel) {
        String title;
        String strOooO00o;
        String roomid;
        String str;
        String str2;
        String str3;
        final OooO0O0 oooO0O0;
        if (shareContentModel == null) {
            return;
        }
        int i = OooO00o.$EnumSwitchMapping$0[shareContentModel.getType().ordinal()];
        boolean z = true;
        String imageUrl = null;
        if (i == 1) {
            RoomShareModel room = shareContentModel.getRoom();
            title = room != null ? room.getTitle() : null;
            RoomShareModel room2 = shareContentModel.getRoom();
            String url = room2 != null ? room2.getUrl() : null;
            RoomShareModel room3 = shareContentModel.getRoom();
            strOooO00o = o0OoOo0.OooO00o(url, "?RoomId=", room3 != null ? room3.getRoomIdx() : null);
            RoomShareModel room4 = shareContentModel.getRoom();
            roomid = room4 != null ? room4.getRoomid() : null;
            RoomShareModel room5 = shareContentModel.getRoom();
            if (room5 != null) {
                imageUrl = room5.getImageUrl();
            }
        } else if (i == 2) {
            ShareWebModel web = shareContentModel.getWeb();
            title = web != null ? web.getTitle() : null;
            ShareWebModel web2 = shareContentModel.getWeb();
            String url2 = web2 != null ? web2.getUrl() : null;
            ShareWebModel web3 = shareContentModel.getWeb();
            strOooO00o = o0OoOo0.OooO00o(url2, "?RoomId=", web3 != null ? web3.getIdx() : null);
            ShareWebModel web4 = shareContentModel.getWeb();
            roomid = web4 != null ? web4.getId() : null;
            ShareWebModel web5 = shareContentModel.getWeb();
            if (web5 != null) {
                imageUrl = web5.getImagesUrl();
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    Intrinsics.checkNotNullParameter("Error：unsupported share type", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                    str = null;
                    str2 = null;
                    str3 = null;
                } else {
                    String strOooO0OO = o0000.OooO0OO(o000OOo.event_share_twitter);
                    EventModel event = shareContentModel.getEvent();
                    title = OooOOOO.OooO00o(strOooO0OO, event != null ? event.getEventName() : null);
                    EventModel event2 = shareContentModel.getEvent();
                    strOooO00o = event2 != null ? event2.getEventShareUrl() : null;
                    EventModel event3 = shareContentModel.getEvent();
                    roomid = String.valueOf(event3 != null ? Long.valueOf(event3.getRoomIdx()) : null);
                    EventModel event4 = shareContentModel.getEvent();
                    if (event4 != null) {
                        imageUrl = event4.getEventImage();
                    }
                }
                oooO0O0 = new OooO0O0(str, str2, shareContentModel, str3);
                if (imageUrl != null && imageUrl.length() != 0) {
                    z = false;
                }
                if (z) {
                    oooO0O0.invoke("");
                    return;
                }
                oo000o oo000oVar = new oo000o(o0oOo0O0.f47832OooO0Oo);
                Intrinsics.checkNotNullExpressionValue(oo000oVar, "download(...)");
                oo000oVar.f43607OooO0Oo = new o0000O00() { // from class: o0o0OoO0.o0OoOoOo
                    @Override // p676oOooo0o.o0000O00
                    public final void result(boolean z2, Object obj) {
                        String str4 = (String) obj;
                        Function1 function1 = oooO0O0;
                        if (function1 != null) {
                            Intrinsics.checkNotNull(str4);
                            function1.invoke(str4);
                        }
                    }
                };
                oo000oVar.OooO0O0(p184o00o00O0.OooO0OO.OooO0Oo(imageUrl));
            }
            ShareWebModel web6 = shareContentModel.getWeb();
            title = web6 != null ? web6.getTitle() : null;
            ShareWebModel web7 = shareContentModel.getWeb();
            strOooO00o = web7 != null ? web7.getUrl() : null;
            ShareWebModel web8 = shareContentModel.getWeb();
            roomid = web8 != null ? web8.getId() : null;
            ShareWebModel web9 = shareContentModel.getWeb();
            if (web9 != null) {
                imageUrl = web9.getImagesUrl();
            }
        }
        str = title;
        str2 = strOooO00o;
        str3 = roomid;
        oooO0O0 = new OooO0O0(str, str2, shareContentModel, str3);
        if (imageUrl != null) {
            z = false;
        }
        if (z) {
            oooO0O0.invoke("");
            return;
        }
        oo000o oo000oVar2 = new oo000o(o0oOo0O0.f47832OooO0Oo);
        Intrinsics.checkNotNullExpressionValue(oo000oVar2, "download(...)");
        oo000oVar2.f43607OooO0Oo = new o0000O00() { // from class: o0o0OoO0.o0OoOoOo
            @Override // p676oOooo0o.o0000O00
            public final void result(boolean z2, Object obj) {
                String str4 = (String) obj;
                Function1 function1 = oooO0O0;
                if (function1 != null) {
                    Intrinsics.checkNotNull(str4);
                    function1.invoke(str4);
                }
            }
        };
        oo000oVar2.OooO0O0(p184o00o00O0.OooO0OO.OooO0Oo(imageUrl));
    }
}
