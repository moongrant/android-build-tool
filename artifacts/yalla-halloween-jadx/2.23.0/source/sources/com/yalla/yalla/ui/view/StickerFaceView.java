package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000O0;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.OooOO0;
import p022Oooo00O.o0OO000o;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\t\u001a\u00020\u00072#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/ui/view/StickerFaceView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "stickerId", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSendStickerMessageListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO0O0", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class StickerFaceView extends RecyclerView {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final /* synthetic */ int f30726OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f30727OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f30728OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f30729OooO0o0;

    @SourceDebugExtension({"SMAP\nStickerFaceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerFaceView.kt\ncom/yalla/yalla/ui/view/StickerFaceView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
    public static final class OooO00o extends o000O<OooO0O0> {
        public OooO00o(int i, Context context, ArrayList arrayList) {
            super(i, context, arrayList);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder helper = (ViewHolder) baseViewHolder;
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            if (oooO0O0 != null) {
                helper.setImageResource(oO00O0oO.iv_face, oooO0O0.f30731OooO0O0);
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f30730OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f30731OooO0O0;

        public OooO0O0(int i, int i2) {
            this.f30730OooO00o = i;
            this.f30731OooO0O0 = i2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f30730OooO00o == oooO0O0.f30730OooO00o && this.f30731OooO0O0 == oooO0O0.f30731OooO0O0;
        }

        public final int hashCode() {
            return (this.f30730OooO00o * 31) + this.f30731OooO0O0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("StickerModel(stickerId=");
            sb.append(this.f30730OooO00o);
            sb.append(", stickerImg=");
            return OooOO0.OooO0O0(sb, this.f30731OooO0O0, ")");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StickerFaceView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setOnSendStickerMessageListener(@Nullable Function1<? super Integer, Unit> listener) {
        this.f30728OooO0o = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StickerFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ StickerFaceView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StickerFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutManager(new GridLayoutManager(context, 4));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new OooO0O0(0, oOo00OO0.icon_room_face_dice));
        arrayList.add(new OooO0O0(1, oOo00OO0.icon_room_face_jsb));
        OooO00o oooO00o = new OooO00o(oO00OO0O.item_sticker_face, context, arrayList);
        this.f30727OooO0Oo = oooO00o;
        setOverScrollMode(2);
        oooO00o.OooOoOO(true);
        setClipToPadding(false);
        setPaddingRelative(o0000O0.OooO00o(12.0f), o0000O0.OooO00o(12.0f), o0000O0.OooO00o(12.0f), o0000O0.OooO00o(12.0f));
        setAdapter(oooO00o);
        oooO00o.f10098OooO0o = new o0OO000o(this);
    }
}
