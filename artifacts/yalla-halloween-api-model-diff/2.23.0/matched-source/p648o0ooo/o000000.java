package p648o0ooo;

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
import com.twitter.sdk.android.core.oo000o;
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
import o0OOOOOO.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;
import p139o00OOooO.OooO0o;
import p382o0OOoo0o.o00Ooo;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o000OOo;
import p415o0Oo0ooO.x0;
import p416o0Oo0ooo.y0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f59731OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ShareLogViewModel f59732OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f59733OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f59734OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f59735OooO0o0;

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
        public final /* synthetic */ String f59737OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f59738OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ShareContentModel f59739OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f59740OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, String str2, ShareContentModel shareContentModel, String str3) {
            super(1);
            this.f59738OooO0o0 = str;
            this.f59737OooO0o = str2;
            this.f59739OooO0oO = shareContentModel;
            this.f59740OooO0oo = str3;
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
        /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:69:0x00fb A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:70:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:75:0x00f4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x00f8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:? A[LOOP:0: B:62:0x00d7->B:77:?, LOOP_END, SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            FragmentActivity fragmentActivity;
            Intent intent;
            StringBuilder sb;
            boolean z;
            boolean z2;
            boolean z3;
            Iterator<ResolveInfo> it;
            String str2;
            String str3;
            boolean z4;
            String imagePath = str;
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            ShareContentModel shareContentModel = this.f59739OooO0oO;
            String str4 = this.f59740OooO0oo;
            o000000 o000000Var = o000000.this;
            o000000O o000000o2 = new o000000O(o000000Var, shareContentModel, str4);
            o000000Var.getClass();
            String str5 = this.f59738OooO0o0;
            boolean z5 = str5 == null || str5.length() == 0;
            String str6 = this.f59737OooO0o;
            if (z5) {
                if (imagePath == null || imagePath.length() == 0) {
                    if (!(str6 == null || str6.length() == 0)) {
                        fragmentActivity = o000000Var.f59731OooO00o;
                        if (fragmentActivity instanceof BaseAppCompatActivity) {
                            ((BaseAppCompatActivity) fragmentActivity).f25139OooO0o0 = new o00000(o000000Var);
                        }
                        intent = new Intent("android.intent.action.SEND");
                        sb = new StringBuilder();
                        if (str5 != null) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            sb.append(str5);
                        }
                        if (str6 != null) {
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
                            sb.append(str6);
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
                        Intrinsics.checkNotNullExpressionValue(packageManager, "activity.packageManager");
                        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "packManager.queryIntentA…CH_DEFAULT_ONLY\n        )");
                        it = listQueryIntentActivities.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                intent = null;
                                break;
                            }
                            str2 = it.next().activityInfo.packageName;
                            Intrinsics.checkNotNullExpressionValue(str2, "resolveInfo.activityInfo.packageName");
                            str3 = o000000Var.f59733OooO0OO;
                            if (StringsKt.Oooo00o(str2, str3)) {
                                intent.setPackage(str3);
                                break;
                            }
                        }
                        if (intent == null) {
                            if (str6 == null) {
                                str6 = "";
                            }
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str7 = String.format(o000000Var.f59734OooO0Oo, Arrays.copyOf(new Object[]{OooOO0.OooO0Oo(str5), OooOO0.OooO0Oo(str6)}, 2));
                            Intrinsics.checkNotNullExpressionValue(str7, "format(format, *args)");
                            intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                        }
                        fragmentActivity.startActivityForResult(intent, o000000Var.f59735OooO0o0);
                        o000000o2.invoke();
                    }
                } else {
                    fragmentActivity = o000000Var.f59731OooO00o;
                    if (fragmentActivity instanceof BaseAppCompatActivity) {
                        ((BaseAppCompatActivity) fragmentActivity).f25139OooO0o0 = new o00000(o000000Var);
                    }
                    intent = new Intent("android.intent.action.SEND");
                    sb = new StringBuilder();
                    if (str5 != null) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        sb.append(str5);
                    }
                    if (str6 != null) {
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
                        sb.append(str6);
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
                    Intrinsics.checkNotNullExpressionValue(packageManager2, "activity.packageManager");
                    List<ResolveInfo> listQueryIntentActivities2 = packageManager2.queryIntentActivities(intent, 65536);
                    Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities2, "packManager.queryIntentA…CH_DEFAULT_ONLY\n        )");
                    it = listQueryIntentActivities2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            intent = null;
                            break;
                        }
                        str2 = it.next().activityInfo.packageName;
                        Intrinsics.checkNotNullExpressionValue(str2, "resolveInfo.activityInfo.packageName");
                        str3 = o000000Var.f59733OooO0OO;
                        if (StringsKt.Oooo00o(str2, str3)) {
                            intent.setPackage(str3);
                            break;
                        }
                    }
                    if (intent == null) {
                        if (str6 == null) {
                            str6 = "";
                        }
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        String str8 = String.format(o000000Var.f59734OooO0Oo, Arrays.copyOf(new Object[]{OooOO0.OooO0Oo(str5), OooOO0.OooO0Oo(str6)}, 2));
                        Intrinsics.checkNotNullExpressionValue(str8, "format(format, *args)");
                        intent = new Intent("android.intent.action.VIEW", Uri.parse(str8));
                    }
                    fragmentActivity.startActivityForResult(intent, o000000Var.f59735OooO0o0);
                    o000000o2.invoke();
                }
            } else {
                fragmentActivity = o000000Var.f59731OooO00o;
                if (fragmentActivity instanceof BaseAppCompatActivity) {
                    ((BaseAppCompatActivity) fragmentActivity).f25139OooO0o0 = new o00000(o000000Var);
                }
                intent = new Intent("android.intent.action.SEND");
                sb = new StringBuilder();
                if (str5 != null || str5.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    sb.append(str5);
                }
                if (str6 != null || str6.length() == 0) {
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
                    sb.append(str6);
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
                Intrinsics.checkNotNullExpressionValue(packageManager3, "activity.packageManager");
                List<ResolveInfo> listQueryIntentActivities3 = packageManager3.queryIntentActivities(intent, 65536);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities3, "packManager.queryIntentA…CH_DEFAULT_ONLY\n        )");
                it = listQueryIntentActivities3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        intent = null;
                        break;
                    }
                    str2 = it.next().activityInfo.packageName;
                    Intrinsics.checkNotNullExpressionValue(str2, "resolveInfo.activityInfo.packageName");
                    str3 = o000000Var.f59733OooO0OO;
                    if (StringsKt.Oooo00o(str2, str3)) {
                        intent.setPackage(str3);
                        break;
                    }
                }
                if (intent == null) {
                    if (str6 == null) {
                        str6 = "";
                    }
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    String str9 = String.format(o000000Var.f59734OooO0Oo, Arrays.copyOf(new Object[]{OooOO0.OooO0Oo(str5), OooOO0.OooO0Oo(str6)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str9, "format(format, *args)");
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(str9));
                }
                fragmentActivity.startActivityForResult(intent, o000000Var.f59735OooO0o0);
                o000000o2.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public o000000(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f59731OooO00o = activity;
        this.f59732OooO0O0 = (ShareLogViewModel) new ViewModelProvider(activity).get(ShareLogViewModel.class);
        this.f59733OooO0OO = "com.twitter.android";
        this.f59734OooO0Oo = "https://twitter.com/intent/tweet?text=%s&url=%s";
        this.f59735OooO0o0 = 1702;
        if (activity == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        Context applicationContext = activity.getApplicationContext();
        OooO0OO oooO0OO = new OooO0OO(0);
        o000OOo o000oooOooO0o = o00Oo0.OooO0o();
        o000oooOooO0o.getClass();
        String strOooO0o0 = o000oooOooO0o.OooO0o0(String.valueOf(-59014420), o0000.OooO0OO(oO00OOo0.single_twitter_key));
        o000OOo o000oooOooO0o2 = o00Oo0.OooO0o();
        o000oooOooO0o2.getClass();
        oo000o oo000oVar = new oo000o(applicationContext, oooO0OO, new TwitterAuthConfig(strOooO0o0, o000oooOooO0o2.OooO0o0(String.valueOf(-1228471549), o0000.OooO0OO(oO00OOo0.single_twitter_secret))), Boolean.valueOf(!o00Ooo.OooO0o0()));
        synchronized (com.twitter.sdk.android.core.o00Oo0.class) {
            if (com.twitter.sdk.android.core.o00Oo0.f22208OooO0oo == null) {
                com.twitter.sdk.android.core.o00Oo0.f22208OooO0oo = new com.twitter.sdk.android.core.o00Oo0(oo000oVar);
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
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.event_share_twitter);
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
                x0 x0Var = new x0(y0.f45410OooO0Oo);
                Intrinsics.checkNotNullExpressionValue(x0Var, "download(externalPrivateImgPath)");
                x0Var.f45401OooO0Oo = new oo0o0O0.OooO0OO() { // from class: o0ooo.o000OOo
                    @Override // oo0o0O0.OooO0OO
                    public final void result(boolean z2, Object obj) {
                        String path = (String) obj;
                        Function1 function1 = oooO0O0;
                        if (function1 != null) {
                            Intrinsics.checkNotNullExpressionValue(path, "path");
                            function1.invoke(path);
                        }
                    }
                };
                x0Var.OooO0O0(OooO0o.OooO0Oo(imageUrl));
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
        x0 x0Var2 = new x0(y0.f45410OooO0Oo);
        Intrinsics.checkNotNullExpressionValue(x0Var2, "download(externalPrivateImgPath)");
        x0Var2.f45401OooO0Oo = new oo0o0O0.OooO0OO() { // from class: o0ooo.o000OOo
            @Override // oo0o0O0.OooO0OO
            public final void result(boolean z2, Object obj) {
                String path = (String) obj;
                Function1 function1 = oooO0O0;
                if (function1 != null) {
                    Intrinsics.checkNotNullExpressionValue(path, "path");
                    function1.invoke(path);
                }
            }
        };
        x0Var2.OooO0O0(OooO0o.OooO0Oo(imageUrl));
    }
}
