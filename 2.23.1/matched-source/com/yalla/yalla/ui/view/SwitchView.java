package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import o000O00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p246o00oo0Oo.o000;
import p407o0Oo0OOO.k1;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0ooOOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00012\b\u0007\u0018\u00002\u00020\u0001:\u0001?B'\b\u0007\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\b\b\u0002\u0010<\u001a\u00020\u0002¢\u0006\u0004\b=\u0010>J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006@"}, d2 = {"Lcom/yalla/yalla/ui/view/SwitchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "position", "", "setCurrentView", "OooO0o", "I", "getResIdBg", "()I", "setResIdBg", "(I)V", "resIdBg", "OooO0oO", "getResIdBgSelect", "setResIdBgSelect", "resIdBgSelect", "OooO0oo", "getTextColor", "setTextColor", "textColor", "OooO", "getTextColorSelect", "setTextColorSelect", "textColorSelect", "OooOO0", "getItemTextHeight", "setItemTextHeight", "itemTextHeight", "Lkotlin/Function1;", "Lcom/yalla/yalla/ui/view/SwitchView$OooO00o;", "OooOO0O", "Lkotlin/jvm/functions/Function1;", "getSetItemListener", "()Lkotlin/jvm/functions/Function1;", "setSetItemListener", "(Lkotlin/jvm/functions/Function1;)V", "setItemListener", "OooOO0o", "getCurrentItemListener", "setCurrentItemListener", "currentItemListener", "", "OooOOO0", "Z", "getCurrentSelectAnimation", "()Z", "setCurrentSelectAnimation", "(Z)V", "currentSelectAnimation", "com/yalla/yalla/ui/view/OooO0o", "OooOOO", "Lkotlin/Lazy;", "getAdapter", "()Lcom/yalla/yalla/ui/view/OooO0o;", "adapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class SwitchView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f30197OooOo0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    public int textColorSelect;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final k1 f30199OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    public int resIdBg;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public List<String> f30201OooO0o0;

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
    public float f30209OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f30210OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f30211OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f30212OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f30213OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f30214OooOo00;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f30215OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final ImageView f30216OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final TextView f30217OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f30218OooO0Oo;

        public OooO00o(int i, @NotNull ConstraintLayout layout, @NotNull ImageView image, @NotNull TextView content) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(content, "content");
            this.f30215OooO00o = i;
            this.f30216OooO0O0 = image;
            this.f30217OooO0OO = content;
            this.f30218OooO0Oo = false;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<OooO0o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30219OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SwitchView f30220OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context, SwitchView switchView) {
            super(0);
            this.f30219OooO0Oo = context;
            this.f30220OooO0o0 = switchView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0o invoke() {
            return new OooO0o(this.f30219OooO0Oo, this.f30220OooO0o0, o0OO00O.switch_view_item);
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

    public static void OooO0Oo(SwitchView switchView, ArrayList titles) {
        Intrinsics.checkNotNullParameter(titles, "titles");
        switchView.f30201OooO0o0 = titles;
        switchView.getAdapter().OooOoO0(titles);
        switchView.f30199OooO0Oo.f43996OooO0OO.post(new OooOo00(switchView, 0, 1));
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
        k1 k1VarInflate = k1.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(k1VarInflate, "inflate(...)");
        this.f30199OooO0Oo = k1VarInflate;
        new ArrayList();
        this.resIdBg = o0OOO0o.bg_tr00_r360;
        this.resIdBgSelect = o0OOO0o.bg_green_r360;
        this.textColor = o0ooOOo.color_333333_65;
        this.textColorSelect = o0ooOOo.color_333333;
        this.itemTextHeight = 24;
        this.adapter = LazyKt.lazy(new OooO0O0(context, this));
        k1VarInflate.f43996OooO0OO.setLayoutManager(new FixLinearLayoutManager(context, 0));
        k1VarInflate.f43996OooO0OO.setAdapter(getAdapter());
        getAdapter().f13187OooO0o = new o000(this);
        this.f30209OooOOOO = -1.0f;
        this.f30210OooOOOo = -1.0f;
        this.f30212OooOOo0 = -1.0f;
        this.f30211OooOOo = -1.0f;
        this.f30213OooOOoo = -1.0f;
        this.f30214OooOo00 = -1.0f;
    }
}
