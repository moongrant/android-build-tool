package p506o0o00oO0;

import OooO00o.OooO0OO;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.common.model.ShareModel;
import com.yalla.yalla.ui.activity.BaseAppCompatActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import p435o0OoOOO0.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ShareModel f41618Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f41619Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f41620Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f41621Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f41622OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(o0oOOo o0oooo2, String str, String str2, ShareModel shareModel, String str3) {
        super(1);
        this.f41619Oooo0o = o0oooo2;
        this.f41620Oooo0oO = str;
        this.f41621Oooo0oo = str2;
        this.f41618Oooo = shareModel;
        this.f41622OoooO00 = str3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[LOOP:0: B:61:0x00da->B:76:?, LOOP_END, SYNTHETIC] */
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
        boolean z4;
        String imagePath = str;
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        o0oOOo o0oooo2 = this.f41619Oooo0o;
        String str3 = this.f41620Oooo0oO;
        String str4 = this.f41621Oooo0oo;
        o0O0o o0o0o = new o0O0o(o0oooo2, this.f41618Oooo, this.f41622OoooO00);
        Objects.requireNonNull(o0oooo2);
        if (str3 == null || str3.length() == 0) {
            if (imagePath == null || imagePath.length() == 0) {
                if (!(str4 == null || str4.length() == 0)) {
                    fragmentActivity = o0oooo2.f41682OooO00o;
                    if (fragmentActivity instanceof BaseAppCompatActivity) {
                        ((BaseAppCompatActivity) fragmentActivity).f21687Oooo0oO = new o0O00000(o0oooo2);
                    }
                    FragmentActivity fragmentActivity2 = o0oooo2.f41682OooO00o;
                    intent = new Intent("android.intent.action.SEND");
                    sb = new StringBuilder();
                    if (str3 != null) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        sb.append(str3);
                    }
                    if (str4 != null) {
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
                        sb.append(str4);
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
                    PackageManager packageManager = o0oooo2.f41682OooO00o.getPackageManager();
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
                        if (StringsKt.OooOoOO(str2, o0oooo2.f41684OooO0OO)) {
                            intent.setPackage(o0oooo2.f41684OooO0OO);
                            break;
                        }
                    }
                    if (intent == null) {
                        if (str4 == null) {
                            str4 = "";
                        }
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        intent = new Intent("android.intent.action.VIEW", Uri.parse(OooO0OO.OooO00o(new Object[]{o00000.OooO0Oo(str3), o00000.OooO0Oo(str4)}, 2, o0oooo2.f41685OooO0Oo, "format(format, *args)")));
                    }
                    fragmentActivity2.startActivityForResult(intent, o0oooo2.f41686OooO0o0);
                    o0o0o.invoke();
                }
            } else {
                fragmentActivity = o0oooo2.f41682OooO00o;
                if (fragmentActivity instanceof BaseAppCompatActivity) {
                    ((BaseAppCompatActivity) fragmentActivity).f21687Oooo0oO = new o0O00000(o0oooo2);
                }
                FragmentActivity fragmentActivity3 = o0oooo2.f41682OooO00o;
                intent = new Intent("android.intent.action.SEND");
                sb = new StringBuilder();
                if (str3 != null) {
                    z = true;
                } else {
                    z = true;
                }
                if (!z) {
                    sb.append(str3);
                }
                if (str4 != null) {
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
                    sb.append(str4);
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
                PackageManager packageManager2 = o0oooo2.f41682OooO00o.getPackageManager();
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
                    if (StringsKt.OooOoOO(str2, o0oooo2.f41684OooO0OO)) {
                        intent.setPackage(o0oooo2.f41684OooO0OO);
                        break;
                    }
                }
                if (intent == null) {
                    if (str4 == null) {
                        str4 = "";
                    }
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(OooO0OO.OooO00o(new Object[]{o00000.OooO0Oo(str3), o00000.OooO0Oo(str4)}, 2, o0oooo2.f41685OooO0Oo, "format(format, *args)")));
                }
                fragmentActivity3.startActivityForResult(intent, o0oooo2.f41686OooO0o0);
                o0o0o.invoke();
            }
        } else {
            fragmentActivity = o0oooo2.f41682OooO00o;
            if (fragmentActivity instanceof BaseAppCompatActivity) {
                ((BaseAppCompatActivity) fragmentActivity).f21687Oooo0oO = new o0O00000(o0oooo2);
            }
            FragmentActivity fragmentActivity4 = o0oooo2.f41682OooO00o;
            intent = new Intent("android.intent.action.SEND");
            sb = new StringBuilder();
            if (str3 != null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                sb.append(str3);
            }
            if (str4 != null || str4.length() == 0) {
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
                sb.append(str4);
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
            PackageManager packageManager3 = o0oooo2.f41682OooO00o.getPackageManager();
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
                if (StringsKt.OooOoOO(str2, o0oooo2.f41684OooO0OO)) {
                    intent.setPackage(o0oooo2.f41684OooO0OO);
                    break;
                }
            }
            if (intent == null) {
                if (str4 == null) {
                    str4 = "";
                }
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                intent = new Intent("android.intent.action.VIEW", Uri.parse(OooO0OO.OooO00o(new Object[]{o00000.OooO0Oo(str3), o00000.OooO0Oo(str4)}, 2, o0oooo2.f41685OooO0Oo, "format(format, *args)")));
            }
            fragmentActivity4.startActivityForResult(intent, o0oooo2.f41686OooO0o0);
            o0o0o.invoke();
        }
        return Unit.INSTANCE;
    }
}
