package com.app.base.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;
import p175o00OooOo.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\t\u001a\u00020\u00072#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¨\u0006\u0012"}, d2 = {"Lcom/app/base/view/StickerFaceView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "stickerId", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSendStickerMessageListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attr", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO0O0", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class StickerFaceView extends RecyclerView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final /* synthetic */ int f12135Oooo = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final p188o00o00o0.OooO0OO<OooO0O0> f12136Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f12137Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f12138Oooo0oo;

    public static final class OooO00o extends p188o00o00o0.OooO0OO<OooO0O0> {
        public OooO00o(Context context, ArrayList<OooO0O0> arrayList) {
            super(context, R.layout.item_sticker_face, arrayList);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            if (oooO0O0 != null) {
                helper.OooO0oo(R.id.iv_face, oooO0O0.f12140OooO0O0);
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f12139OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f12140OooO0O0;

        public OooO0O0(int i, int i2) {
            this.f12139OooO00o = i;
            this.f12140OooO0O0 = i2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f12139OooO00o == oooO0O0.f12139OooO00o && this.f12140OooO0O0 == oooO0O0.f12140OooO0O0;
        }

        public final int hashCode() {
            return (this.f12139OooO00o * 31) + this.f12140OooO0O0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("StickerModel(stickerId=");
            sbOooO0o0.append(this.f12139OooO00o);
            sbOooO0o0.append(", stickerImg=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.f12140OooO0O0, ')');
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StickerFaceView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setOnSendStickerMessageListener(@Nullable Function1<? super Integer, Unit> listener) {
        this.f12138Oooo0oo = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StickerFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StickerFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutManager(new GridLayoutManager(context, 4));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new OooO0O0(0, R.drawable.icon_room_face_dice));
        arrayList.add(new OooO0O0(1, R.drawable.icon_room_face_jsb));
        OooO00o oooO00o = new OooO00o(context, arrayList);
        this.f12136Oooo0o = oooO00o;
        setOverScrollMode(2);
        oooO00o.hindEmptyView(true);
        setClipToPadding(false);
        setPaddingRelative(OooOo00.OooO00o(12.0f), OooOo00.OooO00o(12.0f), OooOo00.OooO00o(12.0f), OooOo00.OooO00o(12.0f));
        setAdapter(oooO00o);
        oooO00o.setOnItemClickListener(new o0OOO00(this));
    }
}
