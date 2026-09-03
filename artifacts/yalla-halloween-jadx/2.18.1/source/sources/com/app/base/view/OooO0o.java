package com.app.base.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.compose.ui.platform.ComposeView;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.GifListJson;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p043OooooO0.o00O0000;
import p175o00OooOo.o0O0o000;
import p175o00OooOo.o0OO000;
import p175o00OooOo.oo0OOoo;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12071Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ FacePanelView f12072Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(int i, FacePanelView facePanelView) {
        super(1);
        this.f12071Oooo0o = i;
        this.f12072Oooo0oO = facePanelView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        if (this.f12071Oooo0o < this.f12072Oooo0oO.f11966o000oOoO.size()) {
            int i = this.f12072Oooo0oO.f11966o000oOoO.get(this.f12071Oooo0o).f11972OooO00o;
            boolean z = false;
            if (i == 1) {
                FacePanelView facePanelView = this.f12072Oooo0oO;
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                Objects.requireNonNull(facePanelView);
                EmojiFaceView emojiFaceView = (EmojiFaceView) ((ViewGroup) view2).findViewById(R.id.emojiFaceView);
                facePanelView.f11959OoooO = emojiFaceView;
                EditText editText = facePanelView.f11962OoooO0O;
                if (editText != null && emojiFaceView != null) {
                    emojiFaceView.OooO00o(editText, false);
                }
            } else if (i != 2) {
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.app.base.view.GifFaceTopBuyContainer");
                GifFaceTopBuyContainer gifFaceTopBuyContainer = (GifFaceTopBuyContainer) view2;
                FacePanelView.OooO0O0 facePanel = this.f12072Oooo0oO.f11966o000oOoO.get(this.f12071Oooo0o);
                OooO0OO send = new OooO0OO(this.f12072Oooo0oO);
                Objects.requireNonNull(gifFaceTopBuyContainer);
                Intrinsics.checkNotNullParameter(facePanel, "facePanel");
                Intrinsics.checkNotNullParameter(send, "send");
                View viewFindViewById = gifFaceTopBuyContainer.findViewById(R.id.gifFaceView);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.gifFaceView)");
                GifFaceView gifFaceView = (GifFaceView) viewFindViewById;
                gifFaceView.setGifData(facePanel);
                gifFaceView.setOnSendGIFMessageListener(new o0O0o000(send));
                if (facePanel.f11973OooO0O0 != null) {
                    ComposeView composeView = (ComposeView) gifFaceTopBuyContainer.findViewById(R.id.compose_view);
                    GifListJson value = facePanel.f11973OooO0O0.getValue();
                    if (value != null && value.getBuyType() == 1) {
                        z = true;
                    }
                    if (z) {
                        Intrinsics.checkNotNullExpressionValue(composeView, "");
                        oOO00O.OooO(composeView);
                        composeView.setContent(o00O0000.OooO0O0(2112778068, true, new o0OO000(facePanel, gifFaceView, composeView)));
                    } else {
                        Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
                        oOO00O.OooO00o(composeView);
                    }
                }
            } else {
                FacePanelView facePanelView2 = this.f12072Oooo0oO;
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                Objects.requireNonNull(facePanelView2);
                View viewFindViewById2 = ((ViewGroup) view2).findViewById(R.id.stickerFaceView);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "viewGroup.findViewById(R.id.stickerFaceView)");
                ((StickerFaceView) viewFindViewById2).setOnSendStickerMessageListener(new oo0OOoo(facePanelView2));
            }
        }
        return Unit.INSTANCE;
    }
}
