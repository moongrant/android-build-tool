package p587o0oOooOO;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o000O;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.ui.view.EmojiFaceView;
import com.yalla.yalla.ui.view.GifFaceTopBuyContainer;
import com.yalla.yalla.ui.view.GifFaceView;
import com.yalla.yalla.ui.view.StickerFaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f56861OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ t f56862OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i, t tVar) {
        super(1);
        this.f56861OooO0Oo = i;
        this.f56862OooO0o0 = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        t tVar = this.f56862OooO0o0;
        int size = tVar.f56975OooO.size();
        int i = this.f56861OooO0Oo;
        if (i < size) {
            SnapshotStateList<r> snapshotStateList = tVar.f56975OooO;
            int i2 = snapshotStateList.get(i).f56939OooO00o;
            if (i2 == 1) {
                tVar.f56985OooOO0O = (EmojiFaceView) view2.findViewById(o0OO00O.emojiFaceView);
                tVar.OooO00o(tVar.f56984OooOO0);
                Function1<? super EmojiFaceView, Unit> function1 = tVar.f56981OooO0o0;
                if (function1 != null) {
                    function1.invoke(tVar.f56985OooOO0O);
                }
            } else if (i2 != 2) {
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.yalla.yalla.ui.view.GifFaceTopBuyContainer");
                GifFaceTopBuyContainer gifFaceTopBuyContainer = (GifFaceTopBuyContainer) view2;
                q qVar = snapshotStateList.get(i).f56942OooO0Oo;
                k send = new k(tVar);
                gifFaceTopBuyContainer.getClass();
                Intrinsics.checkNotNullParameter(send, "send");
                if (qVar != null) {
                    View viewFindViewById = gifFaceTopBuyContainer.findViewById(o0OO00O.gifFaceView);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                    GifFaceView gifFaceView = (GifFaceView) viewFindViewById;
                    gifFaceView.setGifData(qVar);
                    gifFaceView.setOnSendGIFMessageListener(new y(send));
                    MutableLiveData<GifListJson> mutableLiveData = qVar.f56935OooO0O0;
                    if (mutableLiveData != null) {
                        ComposeView composeView = (ComposeView) gifFaceTopBuyContainer.findViewById(o0OO00O.compose_view);
                        GifListJson value = mutableLiveData.getValue();
                        if (value != null && value.getBuyType() == 1) {
                            Intrinsics.checkNotNull(composeView);
                            o000O.OooOOOO(composeView);
                            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-462553007, true, new e0(qVar, gifFaceView, composeView)));
                        } else {
                            Intrinsics.checkNotNull(composeView);
                            o000O.OooO0O0(composeView);
                        }
                    }
                }
            } else {
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) view2;
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                View viewFindViewById2 = viewGroup.findViewById(o0OO00O.stickerFaceView);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                ((StickerFaceView) viewFindViewById2).setOnSendStickerMessageListener(new s(tVar));
            }
        }
        return Unit.INSTANCE;
    }
}
