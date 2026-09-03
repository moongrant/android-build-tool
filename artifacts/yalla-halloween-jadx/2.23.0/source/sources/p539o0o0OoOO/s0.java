package p539o0o0OoOO;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.ui.view.EmojiFaceView;
import com.yalla.yalla.ui.view.GifFaceTopBuyContainer;
import com.yalla.yalla.ui.view.GifFaceView;
import com.yalla.yalla.ui.view.StickerFaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes5.dex */
public final class s0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f55679OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ y0 f55680OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(int i, y0 y0Var) {
        super(1);
        this.f55679OooO0Oo = i;
        this.f55680OooO0o0 = y0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        y0 y0Var = this.f55680OooO0o0;
        int size = y0Var.f55747OooO.size();
        int i = this.f55679OooO0Oo;
        if (i < size) {
            SnapshotStateList<w0> snapshotStateList = y0Var.f55747OooO;
            int i2 = snapshotStateList.get(i).f55735OooO00o;
            if (i2 == 1) {
                y0Var.f55757OooOO0O = (EmojiFaceView) view2.findViewById(oO00O0oO.emojiFaceView);
                y0Var.OooO00o(y0Var.f55756OooOO0);
                Function1<? super EmojiFaceView, Unit> function1 = y0Var.f55753OooO0o0;
                if (function1 != null) {
                    function1.invoke(y0Var.f55757OooOO0O);
                }
            } else if (i2 != 2) {
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.yalla.yalla.ui.view.GifFaceTopBuyContainer");
                GifFaceTopBuyContainer gifFaceTopBuyContainer = (GifFaceTopBuyContainer) view2;
                v0 v0Var = snapshotStateList.get(i).f55738OooO0Oo;
                r0 send = new r0(y0Var);
                gifFaceTopBuyContainer.getClass();
                Intrinsics.checkNotNullParameter(send, "send");
                if (v0Var != null) {
                    View viewFindViewById = gifFaceTopBuyContainer.findViewById(oO00O0oO.gifFaceView);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.gifFaceView)");
                    GifFaceView gifFaceView = (GifFaceView) viewFindViewById;
                    gifFaceView.setGifData(v0Var);
                    gifFaceView.setOnSendGIFMessageListener(new d1(send));
                    MutableLiveData<GifListJson> mutableLiveData = v0Var.f55720OooO0O0;
                    if (mutableLiveData != null) {
                        ComposeView composeView = (ComposeView) gifFaceTopBuyContainer.findViewById(oO00O0oO.compose_view);
                        GifListJson value = mutableLiveData.getValue();
                        if (value != null && value.getBuyType() == 1) {
                            Intrinsics.checkNotNullExpressionValue(composeView, "initData$lambda$0");
                            o000OO00.OooOOOO(composeView);
                            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-462553007, true, new j1(v0Var, gifFaceView, composeView)));
                        } else {
                            Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
                            o000OO00.OooO0O0(composeView);
                        }
                    }
                }
            } else {
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) view2;
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                View viewFindViewById2 = viewGroup.findViewById(oO00O0oO.stickerFaceView);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "viewGroup.findViewById(R.id.stickerFaceView)");
                ((StickerFaceView) viewFindViewById2).setOnSendStickerMessageListener(new x0(y0Var));
            }
        }
        return Unit.INSTANCE;
    }
}
