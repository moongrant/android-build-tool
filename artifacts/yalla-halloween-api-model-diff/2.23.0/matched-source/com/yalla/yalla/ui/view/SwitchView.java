package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.activity.room.o0000O;
import com.yalla.yalla.ui.view.SwitchView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.u9;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00012\b\u0007\u0018\u00002\u00020\u0001:\u0001?B'\b\u0007\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\b\b\u0002\u0010<\u001a\u00020\u0002¢\u0006\u0004\b=\u0010>J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006@"}, d2 = {"Lcom/yalla/yalla/ui/view/SwitchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "position", "", "setCurrentView", "OooO0o", "I", "getResIdBg", "()I", "setResIdBg", "(I)V", "resIdBg", "OooO0oO", "getResIdBgSelect", "setResIdBgSelect", "resIdBgSelect", "OooO0oo", "getTextColor", "setTextColor", "textColor", "OooO", "getTextColorSelect", "setTextColorSelect", "textColorSelect", "OooOO0", "getItemTextHeight", "setItemTextHeight", "itemTextHeight", "Lkotlin/Function1;", "Lcom/yalla/yalla/ui/view/SwitchView$OooO00o;", "OooOO0O", "Lkotlin/jvm/functions/Function1;", "getSetItemListener", "()Lkotlin/jvm/functions/Function1;", "setSetItemListener", "(Lkotlin/jvm/functions/Function1;)V", "setItemListener", "OooOO0o", "getCurrentItemListener", "setCurrentItemListener", "currentItemListener", "", "OooOOO0", "Z", "getCurrentSelectAnimation", "()Z", "setCurrentSelectAnimation", "(Z)V", "currentSelectAnimation", "com/yalla/yalla/ui/view/OooO0o", "OooOOO", "Lkotlin/Lazy;", "getAdapter", "()Lcom/yalla/yalla/ui/view/OooO0o;", "adapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class SwitchView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f30732OooOo0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    public int textColorSelect;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final u9 f30734OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    public int resIdBg;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public List<String> f30736OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    public int resIdBgSelect;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    public int textColor;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    public int itemTextHeight;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super OooO00o, Unit> setItemListener;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super OooO00o, Unit> currentItemListener;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name and from kotlin metadata */
    public boolean currentSelectAnimation;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f30744OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f30745OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f30746OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f30747OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f30748OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f30749OooOo00;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f30750OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final ImageView f30751OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final TextView f30752OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f30753OooO0Oo;

        public OooO00o(int i, @NotNull ConstraintLayout layout, @NotNull ImageView image, @NotNull TextView content) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(content, "content");
            this.f30750OooO00o = i;
            this.f30751OooO0O0 = image;
            this.f30752OooO0OO = content;
            this.f30753OooO0Oo = false;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<OooO0o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30754OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SwitchView f30755OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context, SwitchView switchView) {
            super(0);
            this.f30754OooO0Oo = context;
            this.f30755OooO0o0 = switchView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0o invoke() {
            return new OooO0o(this.f30754OooO0Oo, this.f30755OooO0o0, oO00OO0O.switch_view_item);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void OooO0O0(SwitchView this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getAdapter().Oooo0o0(i);
    }

    public static void OooO0OO(SwitchView this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getAdapter().Oooo0o0(i);
    }

    public static void OooO0Oo(final SwitchView switchView, ArrayList titles) {
        Intrinsics.checkNotNullParameter(titles, "titles");
        switchView.f30736OooO0o0 = titles;
        switchView.getAdapter().OooOoO0(titles);
        final int i = 0;
        switchView.f30734OooO0Oo.f58981OooO0OO.post(new Runnable() { // from class: o0o0OoOO.y2
            @Override // java.lang.Runnable
            public final void run() {
                SwitchView.OooO0OO(this.f55763OooO0Oo, i);
            }
        });
    }

    private final OooO0o getAdapter() {
        return (OooO0o) this.adapter.getValue();
    }

    @Nullable
    public final Function1<OooO00o, Unit> getCurrentItemListener() {
        return this.currentItemListener;
    }

    public final boolean getCurrentSelectAnimation() {
        return this.currentSelectAnimation;
    }

    public final int getItemTextHeight() {
        return this.itemTextHeight;
    }

    public final int getResIdBg() {
        return this.resIdBg;
    }

    public final int getResIdBgSelect() {
        return this.resIdBgSelect;
    }

    @Nullable
    public final Function1<OooO00o, Unit> getSetItemListener() {
        return this.setItemListener;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextColorSelect() {
        return this.textColorSelect;
    }

    public final void setCurrentItemListener(@Nullable Function1<? super OooO00o, Unit> function1) {
        this.currentItemListener = function1;
    }

    public final void setCurrentSelectAnimation(boolean z) {
        this.currentSelectAnimation = z;
    }

    public final void setCurrentView(int position) {
        getAdapter().Oooo0o0(position);
    }

    public final void setItemTextHeight(int i) {
        this.itemTextHeight = i;
    }

    public final void setResIdBg(int i) {
        this.resIdBg = i;
    }

    public final void setResIdBgSelect(int i) {
        this.resIdBgSelect = i;
    }

    public final void setSetItemListener(@Nullable Function1<? super OooO00o, Unit> function1) {
        this.setItemListener = function1;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    public final void setTextColorSelect(int i) {
        this.textColorSelect = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SwitchView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        u9 u9VarInflate = u9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(u9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f30734OooO0Oo = u9VarInflate;
        new ArrayList();
        this.resIdBg = oOo00OO0.bg_tr00_r360;
        this.resIdBgSelect = oOo00OO0.bg_green_r360;
        this.textColor = oO00O0o.color_333333_65;
        this.textColorSelect = oO00O0o.color_333333;
        this.itemTextHeight = 24;
        this.adapter = LazyKt.lazy(new OooO0O0(context, this));
        u9VarInflate.f58981OooO0OO.setLayoutManager(new FixLinearLayoutManager(context, 0));
        u9VarInflate.f58981OooO0OO.setAdapter(getAdapter());
        getAdapter().f10098OooO0o = new o0000O(this);
        this.f30744OooOOOO = -1.0f;
        this.f30745OooOOOo = -1.0f;
        this.f30747OooOOo0 = -1.0f;
        this.f30746OooOOo = -1.0f;
        this.f30748OooOOoo = -1.0f;
        this.f30749OooOo00 = -1.0f;
    }
}
