package p543o0o0OoO0;

import android.view.LayoutInflater;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.model.share.ShareChannel;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentModelKt;
import com.yalla.yalla.model.share.ShareContentType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p505o0o00oO.oO00000o;
import p565o0oOo000.o000000;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0ooOOo;
import p675oO0Oo.o0oO0Ooo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nShareThirdDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareThirdDialog.kt\ncom/yalla/yalla/ui/dialog/shareThird/ShareThirdDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1855#2,2:154\n1855#2,2:156\n1855#2,2:158\n1855#2,2:160\n1855#2,2:162\n*S KotlinDebug\n*F\n+ 1 ShareThirdDialog.kt\ncom/yalla/yalla/ui/dialog/shareThird/ShareThirdDialog\n*L\n53#1:154,2\n96#1:156,2\n99#1:158,2\n141#1:160,2\n147#1:162,2\n*E\n"})
public final class o0O000 extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f54862OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ShareContentType f54863OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final ArrayList f54864OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f54865OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o0O000O f54866OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f54867OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public ShareContentModel f54868OooOOo0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            try {
                iArr[ShareChannel.Friends.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareChannel.Moments.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareChannel.Facebook.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareChannel.Twitter.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShareChannel.Instagram.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShareChannel.WhatsApp.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<p407o0Oo0OOO.o0oO0Ooo> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p407o0Oo0OOO.o0oO0Ooo invoke() {
            o0O000 o0o001 = o0O000.this;
            p407o0Oo0OOO.o0oO0Ooo o0oo0oooInflate = p407o0Oo0OOO.o0oO0Ooo.inflate(LayoutInflater.from(o0o001.f54862OooOO0O), o0o001.f59573OooO0o, true);
            Intrinsics.checkNotNullExpressionValue(o0oo0oooInflate, "inflate(...)");
            return o0oo0oooInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(@NotNull FragmentActivity activity, @NotNull ShareContentType shareContentType) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(shareContentType, "shareContentType");
        this.f54862OooOO0O = activity;
        this.f54863OooOO0o = shareContentType;
        this.f54865OooOOO0 = LazyKt.lazy(new OooO0O0());
        ArrayList arrayList = new ArrayList();
        this.f54864OooOOO = arrayList;
        this.f54866OooOOOO = new o0O000O(activity);
        this.f54867OooOOOo = true;
        LinearLayout linearLayout = OooOO0().f44678OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        OooO0oO(linearLayout);
        OooO0oo(80);
        Window window = this.f59575OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000.animation_bottom_in_bottom_out);
        }
        TextView friends = OooOO0().f44680OooO0OO;
        Intrinsics.checkNotNullExpressionValue(friends, "friends");
        arrayList.add(friends);
        TextView moments = OooOO0().f44682OooO0o;
        Intrinsics.checkNotNullExpressionValue(moments, "moments");
        arrayList.add(moments);
        TextView facebook = OooOO0().f44679OooO0O0;
        Intrinsics.checkNotNullExpressionValue(facebook, "facebook");
        arrayList.add(facebook);
        TextView twitter = OooOO0().f44685OooO0oo;
        Intrinsics.checkNotNullExpressionValue(twitter, "twitter");
        arrayList.add(twitter);
        TextView instagram = OooOO0().f44681OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(instagram, "instagram");
        arrayList.add(instagram);
        TextView whatsApp = OooOO0().f44677OooO;
        Intrinsics.checkNotNullExpressionValue(whatsApp, "whatsApp");
        arrayList.add(whatsApp);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setOnClickListener(new oO00000o(1, this));
        }
    }

    @Override // p675oO0Oo.o0oO0Ooo
    public final void OooO() {
        super.OooO();
        this.f54866OooOOOO.f54875OooO00o = this.f54868OooOOo0;
        ArrayList arrayList = this.f54864OooOOO;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o000O.OooO0O0((TextView) it.next());
        }
        ShareContentType shareContentType = this.f54863OooOO0o;
        boolean z = this.f54867OooOOOo;
        Iterator<T> it2 = ShareContentModelKt.getShareChannels(shareContentType, z).iterator();
        while (it2.hasNext()) {
            switch (OooO00o.$EnumSwitchMapping$0[((ShareChannel) it2.next()).ordinal()]) {
                case 1:
                    TextView friends = OooOO0().f44680OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(friends, "friends");
                    o000O.OooOOOO(friends);
                    break;
                case 2:
                    TextView moments = OooOO0().f44682OooO0o;
                    Intrinsics.checkNotNullExpressionValue(moments, "moments");
                    o000O.OooOOOO(moments);
                    break;
                case 3:
                    TextView facebook = OooOO0().f44679OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(facebook, "facebook");
                    o000O.OooOOOO(facebook);
                    break;
                case 4:
                    TextView twitter = OooOO0().f44685OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(twitter, "twitter");
                    o000O.OooOOOO(twitter);
                    break;
                case 5:
                    TextView instagram = OooOO0().f44681OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(instagram, "instagram");
                    o000O.OooOOOO(instagram);
                    break;
                case 6:
                    TextView whatsApp = OooOO0().f44677OooO;
                    Intrinsics.checkNotNullExpressionValue(whatsApp, "whatsApp");
                    o000O.OooOOOO(whatsApp);
                    break;
            }
        }
        if (z) {
            TextView friends2 = OooOO0().f44680OooO0OO;
            Intrinsics.checkNotNullExpressionValue(friends2, "friends");
            o000O.OooOOOO(friends2);
        } else {
            TextView friends3 = OooOO0().f44680OooO0OO;
            Intrinsics.checkNotNullExpressionValue(friends3, "friends");
            o000O.OooO0O0(friends3);
        }
        OooOO0().f44683OooO0o0.setBackgroundResource(o0OOO0o.shape_dialog_bg_white);
        OooOO0().f44684OooO0oO.setTextColor(o0000.OooO00o(o0ooOOo.color_333333));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((TextView) it3.next()).setTextColor(o0000.OooO00o(o0ooOOo.color_5f5f5f));
        }
    }

    public final p407o0Oo0OOO.o0oO0Ooo OooOO0() {
        return (p407o0Oo0OOO.o0oO0Ooo) this.f54865OooOOO0.getValue();
    }
}
