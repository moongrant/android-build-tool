package p519o0o0O0oO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.code.android.util.o0OoOo0;
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
import p539o0o0OoOO.a0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;
import p641o0ooOOOO.p1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOo0o00 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f53011OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f53012OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OfficialActionModel f53013OooOOO0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            oOo0o00 ooo0o00 = oOo0o00.this;
            OfficialActionModel officialActionModel = ooo0o00.f53013OooOOO0;
            if (officialActionModel != null) {
                o0OO000.OooO0O0("101049", MapsKt.mapOf(TuplesKt.to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
            }
            ooo0o00.OooO0O0();
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
            oOo0o00 ooo0o00 = oOo0o00.this;
            OooOOO0.OooO0O0("OfficialActionDialog 活动 \nData:'" + ooo0o00.f53013OooOOO0 + "'");
            OfficialActionModel officialActionModel = ooo0o00.f53013OooOOO0;
            if (officialActionModel != null) {
                o0OO000.OooO0O0("101048", MapsKt.mapOf(TuplesKt.to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
                String url = officialActionModel.getH5EntranceUrl();
                if (url != null) {
                    if (url.length() > 0) {
                        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
                        Intrinsics.checkNotNullParameter(url, "url");
                        webPageInfo.f32819OooO0o0 = url;
                        webPageInfo.f32816OooO = true;
                        int i = WebActivity.f25584OooOoO0;
                        WebActivity.OooO00o.OooO00o(ooo0o00.f52532OooO0Oo, webPageInfo);
                        ooo0o00.OooO0O0();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<p1> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p1 invoke() {
            oOo0o00 ooo0o00 = oOo0o00.this;
            p1 p1VarInflate = p1.inflate(LayoutInflater.from(ooo0o00.f52532OooO0Oo), ooo0o00.f52533OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(p1VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return p1VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o00(@NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity, 0);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f53011OooOO0O = fragmentActivity;
        Lazy lazy = LazyKt.lazy(new OooO0OO());
        this.f53012OooOO0o = lazy;
        ConstraintLayout constraintLayout = ((p1) lazy.getValue()).f58565OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setGravity(17);
        }
        this.f52534OooO0o0.setCancelable(false);
        ImageView imageView = ((p1) lazy.getValue()).f58567OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.close");
        o000OO00.OooO(imageView, new OooO00o());
        AutoImage autoImage = ((p1) lazy.getValue()).f58566OooO0O0;
        Intrinsics.checkNotNullExpressionValue(autoImage, "binding.autoImage");
        o000OO00.OooO(autoImage, new OooO0O0());
    }

    public final void OooOO0(@Nullable OfficialActionModel officialActionModel) {
        this.f53013OooOOO0 = officialActionModel;
        AutoImage autoImage = ((p1) this.f53012OooOO0o.getValue()).f58566OooO0O0;
        autoImage.getClass();
        FragmentActivity fragmentActivity = this.f53011OooOO0O;
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        autoImage.f30348OooO0oO = fragmentActivity;
        autoImage.f30344OooO = 16;
        autoImage.f30351OooOO0O = Boolean.TRUE;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        autoImage.f30350OooOO0 = scaleType;
        autoImage.f30349OooO0oo = oOo00OO0.icon_picture_default;
        String data = o0OoOo0.OooOOO(officialActionModel.getPopUpImgUrl(), "");
        Intrinsics.checkNotNullParameter(data, "data");
        autoImage.f30347OooO0o0 = null;
        autoImage.f30346OooO0o = null;
        autoImage.removeAllViews();
        autoImage.f30345OooO0Oo = data;
        if (autoImage.f30347OooO0o0 == null) {
            Context context = autoImage.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            autoImage.f30347OooO0o0 = new SVGAView(context, null, 6, 0);
        }
        SVGAView sVGAView = autoImage.f30347OooO0o0;
        if (sVGAView != null) {
            sVGAView.setNotSvgaImageListener(new a0(autoImage, sVGAView));
            int i = autoImage.f30349OooO0oo;
            sVGAView.f10172OooOooO = i;
            sVGAView.setImageResource(i);
            sVGAView.OooOO0O(autoImage.f30345OooO0Oo, autoImage.f30348OooO0oO);
            sVGAView.OooOO0o();
            ImageView.ScaleType scaleType2 = autoImage.f30350OooOO0;
            if (scaleType2 != null) {
                sVGAView.setScaleType(scaleType2);
            }
        }
        o0OO000.OooO0O0("301005", MapsKt.mapOf(TuplesKt.to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
    }
}
