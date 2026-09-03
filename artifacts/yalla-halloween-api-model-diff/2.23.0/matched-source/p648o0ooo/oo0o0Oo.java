package p648o0ooo;

import android.view.LayoutInflater;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.google.android.exoplayer2.ui.o00000;
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
import p519o0o0O0oO.o00O00OO;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.v1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nShareThirdDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareThirdDialog.kt\ncom/yalla/yalla/ui/dialog/shareThird/ShareThirdDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1855#2,2:154\n1855#2,2:156\n1855#2,2:158\n1855#2,2:160\n1855#2,2:162\n*S KotlinDebug\n*F\n+ 1 ShareThirdDialog.kt\ncom/yalla/yalla/ui/dialog/shareThird/ShareThirdDialog\n*L\n53#1:154,2\n96#1:156,2\n99#1:158,2\n141#1:160,2\n147#1:162,2\n*E\n"})
public final class oo0o0Oo extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f59800OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ShareContentType f59801OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final ArrayList f59802OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f59803OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o0O0O00 f59804OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f59805OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public ShareContentModel f59806OooOOo0;

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

    public static final class OooO0O0 extends Lambda implements Function0<v1> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v1 invoke() {
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            v1 v1VarInflate = v1.inflate(LayoutInflater.from(oo0o0oo.f59800OooOO0O), oo0o0oo.f52533OooO0o, true);
            Intrinsics.checkNotNullExpressionValue(v1VarInflate, "inflate(LayoutInflater.f…ty), getRootView(), true)");
            return v1VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(@NotNull FragmentActivity activity, @NotNull ShareContentType shareContentType) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(shareContentType, "shareContentType");
        this.f59800OooOO0O = activity;
        this.f59801OooOO0o = shareContentType;
        this.f59803OooOOO0 = LazyKt.lazy(new OooO0O0());
        ArrayList arrayList = new ArrayList();
        this.f59802OooOOO = arrayList;
        this.f59804OooOOOO = new o0O0O00(activity);
        this.f59805OooOOOo = true;
        LinearLayout linearLayout = OooOO0().f59025OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        OooO0oO(linearLayout);
        OooO0oo(80);
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setWindowAnimations(oO00Oo00.animation_bottom_in_bottom_out);
        }
        TextView textView = OooOO0().f59027OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.friends");
        arrayList.add(textView);
        TextView textView2 = OooOO0().f59029OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.moments");
        arrayList.add(textView2);
        TextView textView3 = OooOO0().f59026OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.facebook");
        arrayList.add(textView3);
        TextView textView4 = OooOO0().f59032OooO0oo;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.twitter");
        arrayList.add(textView4);
        TextView textView5 = OooOO0().f59028OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.instagram");
        arrayList.add(textView5);
        TextView textView6 = OooOO0().f59024OooO;
        Intrinsics.checkNotNullExpressionValue(textView6, "binding.whatsApp");
        arrayList.add(textView6);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setOnClickListener(new o00000(this, 2));
        }
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO() {
        super.OooO();
        this.f59804OooOOOO.f59767OooO00o = this.f59806OooOOo0;
        ArrayList arrayList = this.f59802OooOOO;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o000OO00.OooO0O0((TextView) it.next());
        }
        ShareContentType shareContentType = this.f59801OooOO0o;
        boolean z = this.f59805OooOOOo;
        Iterator<T> it2 = ShareContentModelKt.getShareChannels(shareContentType, z).iterator();
        while (it2.hasNext()) {
            switch (OooO00o.$EnumSwitchMapping$0[((ShareChannel) it2.next()).ordinal()]) {
                case 1:
                    TextView textView = OooOO0().f59027OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.friends");
                    o000OO00.OooOOOO(textView);
                    break;
                case 2:
                    TextView textView2 = OooOO0().f59029OooO0o;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.moments");
                    o000OO00.OooOOOO(textView2);
                    break;
                case 3:
                    TextView textView3 = OooOO0().f59026OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(textView3, "binding.facebook");
                    o000OO00.OooOOOO(textView3);
                    break;
                case 4:
                    TextView textView4 = OooOO0().f59032OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(textView4, "binding.twitter");
                    o000OO00.OooOOOO(textView4);
                    break;
                case 5:
                    TextView textView5 = OooOO0().f59028OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(textView5, "binding.instagram");
                    o000OO00.OooOOOO(textView5);
                    break;
                case 6:
                    TextView textView6 = OooOO0().f59024OooO;
                    Intrinsics.checkNotNullExpressionValue(textView6, "binding.whatsApp");
                    o000OO00.OooOOOO(textView6);
                    break;
            }
        }
        if (z) {
            TextView textView7 = OooOO0().f59027OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView7, "binding.friends");
            o000OO00.OooOOOO(textView7);
        } else {
            TextView textView8 = OooOO0().f59027OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView8, "binding.friends");
            o000OO00.OooO0O0(textView8);
        }
        OooOO0().f59030OooO0o0.setBackgroundResource(oOo00OO0.shape_dialog_bg_white);
        OooOO0().f59031OooO0oO.setTextColor(o0000.OooO00o(oO00O0o.color_333333));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((TextView) it3.next()).setTextColor(o0000.OooO00o(oO00O0o.color_5f5f5f));
        }
    }

    public final v1 OooOO0() {
        return (v1) this.f59803OooOOO0.getValue();
    }
}
