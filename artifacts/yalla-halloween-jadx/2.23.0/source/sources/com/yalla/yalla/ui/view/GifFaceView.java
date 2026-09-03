package com.yalla.yalla.ui.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.gift.GifConfigJson;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.ui.view.GifFaceView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O000o;
import p362o0OOo0O.OooOO0;
import p485o0o00O0.oOO0O0O;
import p539o0o0OoOO.v0;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J@\u0010\u000e\u001a\u00020\u000428\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/view/GifFaceView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lo0o0OoOO/v0;", "gifFace", "", "setGifData", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "gifUrl", "", "gifid", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSendGIFMessageListener", "Lkotlin/Function0;", "OooOOO0", "Lkotlin/jvm/functions/Function0;", "getBuyGifCallBack", "()Lkotlin/jvm/functions/Function0;", "setBuyGifCallBack", "(Lkotlin/jvm/functions/Function0;)V", "buyGifCallBack", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO0O0", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class GifFaceView extends RecyclerView {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f30449OooOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f30450OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f30451OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f30452OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Integer, Unit> f30453OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f30454OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public GifListJson f30455OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f30456OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f30457OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public View f30458OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> buyGifCallBack;

    public static final class OooO00o extends o000O<GifConfigJson> {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ GifFaceView f30460OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ Context f30461OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, GifFaceView gifFaceView, int i) {
            super(context, i);
            this.f30461OooOoo0 = context;
            this.f30460OooOoo = gifFaceView;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            GifConfigJson gifConfigJson = (GifConfigJson) obj;
            if (viewHolder == null || gifConfigJson == null) {
                return;
            }
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f30461OooOoo0);
            GifFaceView gifFaceView = this.f30460OooOoo;
            String str = gifFaceView.f30452OooO0o;
            oooO00o.f43911OooO0OO = OooOOOO.OooO00o(str != null ? p139o00OOooO.OooO0o.OooO0Oo(str) : null, gifConfigJson.getPng());
            boolean z = false;
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.iv_face));
            viewHolder.setText(oO00O0oO.tvGifFaceName, gifConfigJson.getName());
            int i = oO00O0oO.llRoot;
            viewHolder.getView(i).setTag(oO00O0oO.face_position, Integer.valueOf(viewHolder.getLayoutPosition()));
            viewHolder.addOnLongClickListener(i);
            GifListJson gifListJson = gifFaceView.f30455OooO0oo;
            if (gifListJson != null && gifListJson.canNotUse()) {
                z = true;
            }
            if (z) {
                View view = viewHolder.getView(oO00O0oO.iv_lock);
                Intrinsics.checkNotNullExpressionValue(view, "helper.getView<View>(R.id.iv_lock)");
                o000OO00.OooOOOO(view);
            } else {
                View view2 = viewHolder.getView(oO00O0oO.iv_lock);
                Intrinsics.checkNotNullExpressionValue(view2, "helper.getView<View>(R.id.iv_lock)");
                o000OO00.OooO0O0(view2);
            }
        }
    }

    public final class OooO0O0 extends PopupWindow {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f30462OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final NetImageView f30463OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.f30462OooO00o = context;
            setContentView(View.inflate(context, oO00OO0O.gif_popup, null));
            View viewFindViewById = getContentView().findViewById(oO00O0oO.nivGif);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "contentView.findViewById(R.id.nivGif)");
            NetImageView netImageView = (NetImageView) viewFindViewById;
            this.f30463OooO0O0 = netImageView;
            setBackgroundDrawable(new ColorDrawable());
            netImageView.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.o1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GifFaceView.OooO0O0 this$0 = this.f55605OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.dismiss();
                }
            });
            setOutsideTouchable(true);
            setFocusable(true);
        }

        public final void OooO00o(@NotNull View view, @NotNull String gifUrl) {
            Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
            Intrinsics.checkNotNullParameter(view, "view");
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f30462OooO00o);
            oooO00o.f43911OooO0OO = gifUrl;
            oooO00o.f43909OooO00o = 0;
            oooO00o.f43912OooO0Oo = true;
            oooO00o.OooO0o0(8);
            oooO00o.OooO0Oo(this.f30463OooO0O0);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            showAtLocation(view, 0, ((view.getWidth() - o0000O0.OooO00o(130.0f)) / 2) + iArr[0], iArr[1] - o0000O0.OooO00o(130.0f));
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f30464OooO0Oo;

        public OooO0OO(OooO0o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f30464OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f30464OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f30464OooO0Oo;
        }

        public final int hashCode() {
            return this.f30464OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30464OooO0Oo.invoke(obj);
        }
    }

    @SourceDebugExtension({"SMAP\nGifFaceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifFaceView.kt\ncom/yalla/yalla/ui/view/GifFaceView$setGifData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n1#2:195\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<GifListJson, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GifListJson gifListJson) {
            GifListJson gifListJson2 = gifListJson;
            String folderName = gifListJson2.getFolderName();
            GifFaceView gifFaceView = GifFaceView.this;
            gifFaceView.f30452OooO0o = folderName;
            gifFaceView.f30455OooO0oo = gifListJson2;
            gifFaceView.f30451OooO0Oo.OooOoO0(gifListJson2.getItem());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifFaceView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static boolean OooO0O0(View view, MotionEvent motionEvent) {
        if (view == null) {
            return false;
        }
        float x = view.getX();
        float x2 = view.getX() + view.getWidth();
        float x3 = motionEvent.getX();
        if (!(x <= x3 && x3 <= x2)) {
            return false;
        }
        float y = view.getY();
        float y2 = view.getY() + view.getHeight();
        float y3 = motionEvent.getY();
        return (y > y3 ? 1 : (y == y3 ? 0 : -1)) <= 0 && (y3 > y2 ? 1 : (y3 == y2 ? 0 : -1)) <= 0;
    }

    public final void OooO0OO(boolean z, MotionEvent motionEvent) {
        try {
            if (!z) {
                this.f30458OooOO0o = null;
                OooO0O0 oooO0O0 = this.f30454OooO0oO;
                if (oooO0O0 != null) {
                    oooO0O0.dismiss();
                    return;
                }
                return;
            }
            ArrayList arrayList = this.f30457OooOO0O;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (OooO0O0(view, motionEvent) && !OooO0O0(this.f30458OooOO0o, motionEvent)) {
                    Object tag = view.getTag(oO00O0oO.face_position);
                    Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                    Object obj = this.f30451OooO0Oo.f10111OooOOoo.get(((Integer) tag).intValue());
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.gift.GifConfigJson");
                    GifConfigJson gifConfigJson = (GifConfigJson) obj;
                    this.f30458OooOO0o = view;
                    OooO0O0 oooO0O1 = this.f30454OooO0oO;
                    if (oooO0O1 != null) {
                        oooO0O1.dismiss();
                    }
                    this.f30454OooO0oO = null;
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    OooO0O0 oooO0O2 = new OooO0O0(context);
                    this.f30454OooO0oO = oooO0O2;
                    String str = this.f30452OooO0o;
                    String strOooO0Oo = str != null ? p139o00OOooO.OooO0o.OooO0Oo(str) : null;
                    oooO0O2.OooO00o(view, strOooO0Oo + gifConfigJson.getGif());
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (this.f30450OooO) {
                return super.dispatchTouchEvent(motionEvent);
            }
            OooO0OO(true, motionEvent);
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        OooO0O0 oooO0O0 = this.f30454OooO0oO;
        if (oooO0O0 != null) {
            oooO0O0.dismiss();
        }
        this.f30450OooO = true;
        OooO0OO(false, motionEvent);
        getParent().requestDisallowInterceptTouchEvent(false);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public final Function0<Unit> getBuyGifCallBack() {
        return this.buyGifCallBack;
    }

    public final void setBuyGifCallBack(@Nullable Function0<Unit> function0) {
        this.buyGifCallBack = function0;
    }

    public final void setGifData(@NotNull v0 gifFace) {
        Intrinsics.checkNotNullParameter(gifFace, "gifFace");
        MutableLiveData<GifListJson> mutableLiveData = gifFace.f55720OooO0O0;
        if (mutableLiveData != null) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            mutableLiveData.observe((AppCompatActivity) context, new OooO0OO(new OooO0o()));
        }
    }

    public final void setOnSendGIFMessageListener(@Nullable Function2<? super String, ? super Integer, Unit> listener) {
        this.f30453OooO0o0 = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30450OooO = true;
        this.f30457OooOO0O = new ArrayList();
        setLayoutManager(new GridLayoutManager(context, 4));
        OooO00o oooO00o = new OooO00o(context, this, oO00OO0O.item_sticker_face);
        oooO00o.OooOoOO(true);
        oooO00o.f10098OooO0o = new oOO0O0O(this, oooO00o, 1);
        oooO00o.f10093OooO = new o00O000o(this);
        this.f30451OooO0Oo = oooO00o;
        setOverScrollMode(2);
        setClipToPadding(false);
        setPaddingRelative(o0000O0.OooO00o(0.0f), o0000O0.OooO00o(0.0f), o0000O0.OooO00o(0.0f), o0000O0.OooO00o(16.0f));
        setAdapter(oooO00o);
    }

    public /* synthetic */ GifFaceView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
