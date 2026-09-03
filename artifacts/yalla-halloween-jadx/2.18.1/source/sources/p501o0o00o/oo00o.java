package p501o0o00o;

import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropSubDetailsModel;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.oOO00O;
import p498o0o00Oo0.OooOOO;
import p516o0o0O000.o00000OO;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00o extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41532Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(o000 o000Var) {
        super(1);
        this.f41532Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        GiftPropSubDetailsModel subPropDetails;
        GiftPropModel giftPropModel2 = giftPropModel;
        if (!this.f41532Oooo0o.OooOo00().f50852OooOo0.isShown() && Intrinsics.areEqual(giftPropModel2, this.f41532Oooo0o.f41410OooOo0O) && giftPropModel2 != null && (subPropDetails = giftPropModel2.getSubPropDetails()) != null) {
            o000 o000Var = this.f41532Oooo0o;
            FrameLayout frameLayout = o000Var.OooOo00().f50852OooOo0;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.overrideGiftContainer");
            oOO00O.OooO(frameLayout);
            String params = o00000OO.OooO0O0(o00000OO.OooO0O0(o00000OO.OooO0O0(o00000OO.OooO00o(""), "region", OooOOO.f41216OooO00o.OooOOO().getValue() + ""), "giftid", subPropDetails.getBlindBoxId() + ""), "showArea", String.valueOf(o000Var.f41394OooO.getValue()));
            GiftBlindWebManager giftBlindWebManager = (GiftBlindWebManager) o000Var.f41404OooOOo.getValue();
            String url = subPropDetails.getDescUrl();
            Objects.requireNonNull(giftBlindWebManager);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(params, "params");
            oo000o oo000oVar = new oo000o(giftBlindWebManager);
            if (giftBlindWebManager.f20889OooO0Oo) {
                giftBlindWebManager.f20887OooO0O0.removeAllViews();
                oOO00O.OooO(giftBlindWebManager.f20887OooO0O0);
                giftBlindWebManager.f20887OooO0O0.addView(giftBlindWebManager.f20888OooO0OO.f49622OooO00o);
                oo000oVar.invoke();
            } else {
                giftBlindWebManager.f20889OooO0Oo = true;
                giftBlindWebManager.f20887OooO0O0.addView(giftBlindWebManager.f20888OooO0OO.f49622OooO00o);
                oo000oVar.invoke();
                ConstraintLayout constraintLayout = giftBlindWebManager.f20888OooO0OO.f49622OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
                oOO00O.OooO0oO(constraintLayout, new o000oOoO(giftBlindWebManager));
                ScrollView scrollView = giftBlindWebManager.f20888OooO0OO.f49625OooO0Oo.f49665OooO00o;
                Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
                oOO00O.OooO00o(scrollView);
                giftBlindWebManager.f20888OooO0OO.f49625OooO0Oo.f49666OooO0O0.setOnClickListener(new o0OoOo0(giftBlindWebManager));
                giftBlindWebManager.f20888OooO0OO.f49626OooO0o0.setBackgroundColor(0);
                giftBlindWebManager.f20888OooO0OO.f49626OooO0o0.getSettings().setCacheMode(2);
                giftBlindWebManager.f20888OooO0OO.f49626OooO0o0.setLoadStateListener(new o00O0O(giftBlindWebManager));
                giftBlindWebManager.f20888OooO0OO.f49626OooO0o0.addJavascriptInterface(new o00Ooo(giftBlindWebManager, params), "Yalla");
                giftBlindWebManager.f20888OooO0OO.f49626OooO0o0.loadUrl(url + params);
                OooOo.OooO0O0("302004");
            }
        }
        return Unit.INSTANCE;
    }
}
