package p650o0ooo;

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
import p405o0Oo0OOO.o0OoOoOo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO0000 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f58919OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f58920OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OfficialActionModel f58921OooOOO0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            oOO0000 ooo0000 = oOO0000.this;
            OfficialActionModel officialActionModel = ooo0000.f58921OooOOO0;
            if (officialActionModel != null) {
                o0oo0000.OooO00o.OooO0OO("101049", MapsKt.mapOf(TuplesKt.to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
            }
            ooo0000.OooO0O0();
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
            oOO0000 ooo0000 = oOO0000.this;
            o0000O00.OooO0O0("OfficialActionDialog 活动 \nData:'" + ooo0000.f58921OooOOO0 + "'");
            OfficialActionModel officialActionModel = ooo0000.f58921OooOOO0;
            if (officialActionModel != null) {
                o0oo0000.OooO00o.OooO0OO("101048", MapsKt.mapOf(TuplesKt.to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
                String url = officialActionModel.getH5EntranceUrl();
                if (url != null) {
                    if (url.length() > 0) {
                        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
                        Intrinsics.checkNotNullParameter(url, "url");
                        webPageInfo.f32283OooO0o0 = url;
                        webPageInfo.f32280OooO = true;
                        int i = WebActivity.f25130OooOoO0;
                        WebActivity.OooO00o.OooO00o(ooo0000.f58507OooO0Oo, webPageInfo);
                        ooo0000.OooO0O0();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0OoOoOo> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OoOoOo invoke() {
            oOO0000 ooo0000 = oOO0000.this;
            o0OoOoOo o0ooooooInflate = o0OoOoOo.inflate(LayoutInflater.from(ooo0000.f58507OooO0Oo), ooo0000.f58508OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(o0ooooooInflate, "inflate(...)");
            return o0ooooooInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0000(@NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity, 0);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f58919OooOO0O = fragmentActivity;
        Lazy lazy = LazyKt.lazy(new OooO0OO());
        this.f58920OooOO0o = lazy;
        ConstraintLayout constraintLayout = ((o0OoOoOo) lazy.getValue()).f44659OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setGravity(17);
        }
        this.f58509OooO0o0.setCancelable(false);
        ImageView close = ((o0OoOoOo) lazy.getValue()).f44661OooO0OO;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        o000O.OooO(close, new OooO00o());
        AutoImage autoImage = ((o0OoOoOo) lazy.getValue()).f44660OooO0O0;
        Intrinsics.checkNotNullExpressionValue(autoImage, "autoImage");
        o000O.OooO(autoImage, new OooO0O0());
    }
}
