package p675oO0Oo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o000O;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.user.OfficialActionModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.view.AutoImage;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOO.o0O000Oo;
import p593o0oOoooO.h0;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class s extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f59940OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f59941OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OfficialActionModel f59942OooOOO0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            s sVar = s.this;
            OfficialActionModel officialActionModel = sVar.f59942OooOOO0;
            if (officialActionModel != null) {
                h0.OooO0OO("101049", MapsKt.mapOf(TuplesKt.to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
            }
            sVar.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            s sVar = s.this;
            OooOOOO.OooO0O0("MainDialogUserReturn 活动 \nData:'" + sVar.f59942OooOOO0 + "'");
            OfficialActionModel officialActionModel = sVar.f59942OooOOO0;
            if (officialActionModel != null) {
                h0.OooO0OO("101048", MapsKt.mapOf(TuplesKt.to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
                String url = officialActionModel.getH5EntranceUrl();
                if (url != null) {
                    if (url.length() > 0) {
                        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
                        Intrinsics.checkNotNullParameter(url, "url");
                        webPageInfo.f32289OooO0o0 = url;
                        webPageInfo.f32286OooO = true;
                        int i = WebActivity.f25131OooOoO0;
                        WebActivity.OooO00o.OooO00o(sVar.f59572OooO0Oo, webPageInfo);
                        sVar.OooO0O0();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0O000Oo> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O000Oo invoke() {
            s sVar = s.this;
            o0O000Oo o0o000ooInflate = o0O000Oo.inflate(LayoutInflater.from(sVar.f59572OooO0Oo), sVar.f59573OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(o0o000ooInflate, "inflate(...)");
            return o0o000ooInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity, 0);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f59940OooOO0O = fragmentActivity;
        Lazy lazy = LazyKt.lazy(new OooO0OO());
        this.f59941OooOO0o = lazy;
        ConstraintLayout constraintLayout = ((o0O000Oo) lazy.getValue()).f44418OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window window = this.f59575OooO0oO;
        if (window != null) {
            window.setGravity(17);
        }
        this.f59574OooO0o0.setCancelable(false);
        ImageView close = ((o0O000Oo) lazy.getValue()).f44420OooO0OO;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        o000O.OooO(close, new OooO00o());
        AutoImage autoImage = ((o0O000Oo) lazy.getValue()).f44419OooO0O0;
        Intrinsics.checkNotNullExpressionValue(autoImage, "autoImage");
        o000O.OooO(autoImage, new OooO0O0());
    }
}
