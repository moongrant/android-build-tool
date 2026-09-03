package p508o0o00oO0;

import android.view.LayoutInflater;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ShareChannel;
import com.yalla.yalla.common.model.ShareModel;
import com.yalla.yalla.common.model.ShareModelKt;
import com.yalla.yalla.common.model.ShareType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.oOO00O;
import p504o0o00o0.o00000O;
import p518o0o0O000.o00000O0;
import p651o0ooOOoo.f8;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oo00oO extends o00000O {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f41698OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public ShareType f41699OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f41700OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final List<TextView> f41701OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00000O0 f41702OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f41703Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f41704Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public ShareModel f41705OooooO0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            iArr[ShareChannel.Friends.ordinal()] = 1;
            iArr[ShareChannel.Moments.ordinal()] = 2;
            iArr[ShareChannel.Facebook.ordinal()] = 3;
            iArr[ShareChannel.Twitter.ordinal()] = 4;
            iArr[ShareChannel.Instagram.ordinal()] = 5;
            iArr[ShareChannel.WhatsApp.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<f8> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final f8 invoke() {
            f8 f8VarInflate = f8.inflate(LayoutInflater.from(oo00oO.this.f41698OoooOOO), oo00oO.this.f41563OoooO0, true);
            Intrinsics.checkNotNullExpressionValue(f8VarInflate, "inflate(LayoutInflater.f…ty), getRootView(), true)");
            return f8VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00oO(@NotNull FragmentActivity activity, @NotNull ShareType shareType) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(shareType, "shareType");
        int i = 0;
        this.f41698OoooOOO = activity;
        this.f41699OoooOOo = shareType;
        this.f41700OoooOo0 = LazyKt.lazy(new OooO0O0());
        ArrayList arrayList = new ArrayList();
        this.f41701OoooOoO = arrayList;
        this.f41702OoooOoo = new o00000O0(activity, this.f41699OoooOOo);
        this.f41703Ooooo00 = true;
        LinearLayout linearLayout = OooOO0O().f49368OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        OooO0oO(linearLayout);
        OooO0oo(80);
        Window window = this.f41565OoooO0O;
        if (window != null) {
            window.setWindowAnimations(R.style.animation_bottom_in_bottom_out);
        }
        TextView textView = OooOO0O().f49370OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.friends");
        arrayList.add(textView);
        TextView textView2 = OooOO0O().f49372OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.moments");
        arrayList.add(textView2);
        TextView textView3 = OooOO0O().f49369OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.facebook");
        arrayList.add(textView3);
        TextView textView4 = OooOO0O().f49375OooO0oo;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.twitter");
        arrayList.add(textView4);
        TextView textView5 = OooOO0O().f49371OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.instagram");
        arrayList.add(textView5);
        TextView textView6 = OooOO0O().f49367OooO;
        Intrinsics.checkNotNullExpressionValue(textView6, "binding.whatsApp");
        arrayList.add(textView6);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setOnClickListener(new o0O00o0(this, i));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<android.widget.TextView>] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList, java.util.List<android.widget.TextView>] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.ArrayList, java.util.List<android.widget.TextView>] */
    @Override // p504o0o00o0.o00000O
    public final void OooOO0() {
        super.OooOO0();
        this.f41702OoooOoo.f42085OooO00o = this.f41705OooooO0;
        Iterator it = this.f41701OoooOoO.iterator();
        while (it.hasNext()) {
            oOO00O.OooO00o((TextView) it.next());
        }
        Iterator<T> it2 = ShareModelKt.getShareChannels(this.f41699OoooOOo, this.f41703Ooooo00).iterator();
        while (it2.hasNext()) {
            switch (OooO00o.$EnumSwitchMapping$0[((ShareChannel) it2.next()).ordinal()]) {
                case 1:
                    TextView textView = OooOO0O().f49370OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.friends");
                    oOO00O.OooO(textView);
                    break;
                case 2:
                    TextView textView2 = OooOO0O().f49372OooO0o;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.moments");
                    oOO00O.OooO(textView2);
                    break;
                case 3:
                    TextView textView3 = OooOO0O().f49369OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(textView3, "binding.facebook");
                    oOO00O.OooO(textView3);
                    break;
                case 4:
                    TextView textView4 = OooOO0O().f49375OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(textView4, "binding.twitter");
                    oOO00O.OooO(textView4);
                    break;
                case 5:
                    TextView textView5 = OooOO0O().f49371OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(textView5, "binding.instagram");
                    oOO00O.OooO(textView5);
                    break;
                case 6:
                    TextView textView6 = OooOO0O().f49367OooO;
                    Intrinsics.checkNotNullExpressionValue(textView6, "binding.whatsApp");
                    oOO00O.OooO(textView6);
                    break;
            }
        }
        if (this.f41703Ooooo00) {
            TextView textView7 = OooOO0O().f49370OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView7, "binding.friends");
            oOO00O.OooO(textView7);
        } else {
            TextView textView8 = OooOO0O().f49370OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView8, "binding.friends");
            oOO00O.OooO00o(textView8);
        }
        if (this.f41704Ooooo0o) {
            OooOO0O().f49373OooO0o0.setBackgroundResource(R.drawable.shape_dialog_bg_black);
            OooOO0O().f49374OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.white));
            Iterator it3 = this.f41701OoooOoO.iterator();
            while (it3.hasNext()) {
                ((TextView) it3.next()).setTextColor(o000O0O0.OooO00o(R.color.color_FFFFFFF_70));
            }
            return;
        }
        OooOO0O().f49373OooO0o0.setBackgroundResource(R.drawable.shape_dialog_bg_white);
        OooOO0O().f49374OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.color_333333));
        Iterator it4 = this.f41701OoooOoO.iterator();
        while (it4.hasNext()) {
            ((TextView) it4.next()).setTextColor(o000O0O0.OooO00o(R.color.color_5f5f5f));
        }
    }

    public final f8 OooOO0O() {
        return (f8) this.f41700OoooOo0.getValue();
    }
}
