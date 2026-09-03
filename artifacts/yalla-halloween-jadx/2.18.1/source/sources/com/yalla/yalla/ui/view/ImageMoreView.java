package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.d;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.model.ImageItemModel;
import com.yalla.yalla.ui.view.ImageItemView;
import com.yalla.yalla.ui.view.ImageMoreView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p601o0oo00Oo.o00O00OO;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.de;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00103\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rJ\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\rJ\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rR6\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"¨\u00066"}, d2 = {"Lcom/yalla/yalla/ui/view/ImageMoreView;", "Landroid/widget/LinearLayout;", "", "getMax", "getMin", "", "isForward", "", "setForward", "getCount", "Ljava/util/ArrayList;", "", "getUrlList", "", "Lcom/yalla/yalla/ui/view/ImageItemView;", "getAllItemView", "Landroid/util/SparseArray;", "Landroid/widget/ImageView;", "getAllItemViewImageView", "getAllImageViewList", "getAllGifItemView", "Lkotlin/Function2;", "Oooo0oO", "Lkotlin/jvm/functions/Function2;", "getListener", "()Lkotlin/jvm/functions/Function2;", "setListener", "(Lkotlin/jvm/functions/Function2;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lcom/yalla/yalla/model/ImageItemModel;", "OoooO0", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "OoooO0O", "I", "getPosition", "()I", "setPosition", "(I)V", "position", "imageMoreItemViewList", "getImageMoreItemViewList", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ImageMoreView extends LinearLayout {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f24827OoooOoO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final List<ImageItemView> f24828Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final de f24829Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function2<? super ImageItemView, ? super Integer, Unit> listener;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final List<ImageItemView> f24831Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f24832OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public List<ImageItemModel> data;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public Map<Integer, ImageItemView> f24834OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int f24836OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public SparseArray<ImageView> f24837OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public List<ImageView> f24838OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public List<ImageItemView> f24839OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final int f24840o000oOoO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageMoreView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final List<ImageItemView> getImageMoreItemViewList() {
        if (this.f24839OoooOo0 == null) {
            this.f24839OoooOo0 = new ArrayList();
        }
        return this.f24839OoooOo0;
    }

    private final int getMax() {
        return OooOo00.OooO00o(((this.f24832OoooO ? this.f24836OoooOO0 : this.f24840o000oOoO) * 2) + 6);
    }

    private final int getMin() {
        return OooOo00.OooO00o(this.f24832OoooO ? this.f24836OoooOO0 : this.f24840o000oOoO);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, com.yalla.yalla.ui.view.ImageItemView>] */
    public final List<ImageItemView> OooO00o(boolean z) {
        ImageItemModel imageItemModel;
        getImageMoreItemViewList().clear();
        List<ImageItemModel> list = this.data;
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ImageItemModel imageItemModel2 = (ImageItemModel) obj;
                ImageItemView imageItemView = null;
                if (this.f24834OoooO00.containsKey(Integer.valueOf(i)) && (imageItemView = (ImageItemView) this.f24834OoooO00.get(Integer.valueOf(i))) != null && (imageItemModel = imageItemView.data) != null) {
                    imageItemView.setVisibility(0);
                    imageItemView.f24824Oooo0o.f49105OooO0OO.setVisibility(0);
                    int gifType = imageItemModel.getGifType();
                    if (gifType == 0) {
                        imageItemView.f24824Oooo0o.f49104OooO0O0.setVisibility(8);
                    } else if (gifType == 1 || CloudImageUtilKt.imgContainsGif(imageItemModel.getUrl())) {
                        imageItemView.f24824Oooo0o.f49104OooO0O0.setVisibility(0);
                    }
                    imageItemView.f24825Oooo0oO = CloudImageUtilKt.imgSize(imageItemModel.getUrl(), imageItemView.getWidth(), imageItemView.getHeight());
                    oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(imageItemView.getContext());
                    oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
                    oooO00o.f48454OooOoo0 = 2;
                    oooO00o.f48444OooOOoo = 1;
                    oooO00o.OooO0oO(4);
                    oooO00o.f48429OooO0OO = imageItemView.f24825Oooo0oO;
                    oooO00o.f48427OooO00o = 0;
                    oooO00o.OooO0o(imageItemView.f24824Oooo0o.f49105OooO0OO);
                }
                if (!z) {
                    getImageMoreItemViewList().add(imageItemView);
                } else if (imageItemModel2.getGifType() == 1) {
                    getImageMoreItemViewList().add(imageItemView);
                }
                i = i2;
            }
        }
        return getImageMoreItemViewList();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.ui.view.ImageItemView>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.ui.view.ImageItemView>] */
    public final void OooO0O0() {
        ImageItemView imageItemView = this.f24829Oooo0o.f49181OooO0O0;
        imageItemView.setVisibility(8);
        imageItemView.OooO00o();
        for (ImageItemView imageItemView2 : this.f24831Oooo0oo) {
            if (imageItemView2 != null) {
                imageItemView2.setVisibility(8);
            }
            if (imageItemView2 != null) {
                imageItemView2.OooO00o();
            }
        }
        for (ImageItemView imageItemView3 : this.f24828Oooo) {
            if (imageItemView3 != null) {
                imageItemView3.setVisibility(8);
            }
            if (imageItemView3 != null) {
                imageItemView3.OooO00o();
            }
        }
    }

    @NotNull
    public final List<ImageItemView> getAllGifItemView() {
        return OooO00o(true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<android.widget.ImageView>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<android.widget.ImageView>] */
    @Nullable
    public final List<ImageView> getAllImageViewList() {
        if (this.f24838OoooOOo == null) {
            this.f24838OoooOOo = new ArrayList();
        }
        ?? r0 = this.f24838OoooOOo;
        if (r0 != 0) {
            r0.clear();
        }
        for (ImageItemView imageItemView : OooO00o(false)) {
            ?? r2 = this.f24838OoooOOo;
            if (r2 != 0) {
                r2.add(imageItemView != null ? imageItemView.getImageView() : null);
            }
        }
        return this.f24838OoooOOo;
    }

    @Nullable
    public final List<ImageItemView> getAllItemView() {
        return OooO00o(false);
    }

    @Nullable
    public final SparseArray<ImageView> getAllItemViewImageView() {
        if (this.f24837OoooOOO == null) {
            this.f24837OoooOOO = new SparseArray<>();
        }
        SparseArray<ImageView> sparseArray = this.f24837OoooOOO;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        List<ImageItemView> listOooO00o = OooO00o(false);
        int size = listOooO00o.size();
        for (int i = 0; i < size; i++) {
            SparseArray<ImageView> sparseArray2 = this.f24837OoooOOO;
            if (sparseArray2 != null) {
                ImageItemView imageItemView = listOooO00o.get(i);
                sparseArray2.append(i, imageItemView != null ? imageItemView.getImageView() : null);
            }
        }
        return this.f24837OoooOOO;
    }

    public final int getCount() {
        List<ImageItemModel> list = this.data;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Nullable
    public final List<ImageItemModel> getData() {
        return this.data;
    }

    @Nullable
    public final Function2<ImageItemView, Integer, Unit> getListener() {
        return this.listener;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final ArrayList<String> getUrlList() {
        ArrayList<String> arrayList = new ArrayList<>();
        List<ImageItemModel> list = this.data;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ImageItemModel) it.next()).getUrl());
            }
        }
        return arrayList;
    }

    public final void setData(@Nullable List<ImageItemModel> list) {
        this.data = list;
    }

    public final void setForward(boolean isForward) {
        this.f24832OoooO = isForward;
    }

    public final void setListener(@Nullable Function2<? super ImageItemView, ? super Integer, Unit> function2) {
        this.listener = function2;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageMoreView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageMoreView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        de deVarInflate = de.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(deVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24829Oooo0o = deVarInflate;
        ArrayList<ImageItemView> arrayList = new ArrayList();
        this.f24831Oooo0oo = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f24828Oooo = arrayList2;
        this.f24834OoooO00 = new LinkedHashMap();
        this.position = -1;
        arrayList.add(deVarInflate.f49182OooO0OO);
        arrayList.add(deVarInflate.f49183OooO0Oo);
        arrayList.add(deVarInflate.f49185OooO0o0);
        arrayList.add(deVarInflate.f49184OooO0o);
        arrayList.add(deVarInflate.f49186OooO0oO);
        arrayList.add(deVarInflate.f49187OooO0oo);
        arrayList.add(deVarInflate.f49179OooO);
        arrayList.add(deVarInflate.f49188OooOO0);
        arrayList.add(deVarInflate.f49189OooOO0O);
        arrayList2.add(deVarInflate.f49182OooO0OO);
        arrayList2.add(deVarInflate.f49183OooO0Oo);
        arrayList2.add(deVarInflate.f49184OooO0o);
        arrayList2.add(deVarInflate.f49186OooO0oO);
        for (final ImageItemView imageItemView : arrayList) {
            if (imageItemView != null) {
                imageItemView.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.o00O00o0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ImageMoreView this$0 = this.f48121Oooo0o;
                        ImageItemView imageItemView2 = imageItemView;
                        int i2 = ImageMoreView.f24827OoooOoO;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Function2<? super ImageItemView, ? super Integer, Unit> function2 = this$0.listener;
                        if (function2 != null) {
                            function2.invoke(imageItemView2, Integer.valueOf(imageItemView2.getPosition()));
                        }
                    }
                });
            }
        }
        setOnClickListener(new o00O00OO(this, this.f24829Oooo0o.f49181OooO0O0, 0));
        OooO0O0();
        this.f24836OoooOO0 = 96;
        this.f24840o000oOoO = 106;
        new ArrayList();
        new ArrayList();
        this.f24837OoooOOO = new SparseArray<>();
        this.f24838OoooOOo = new ArrayList();
        this.f24839OoooOo0 = new ArrayList();
    }
}
