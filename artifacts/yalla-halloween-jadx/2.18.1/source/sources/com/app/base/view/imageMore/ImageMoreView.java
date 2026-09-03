package com.app.base.view.imageMore;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public class ImageMoreView extends ConstraintLayout implements o00Oo00.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ImageMoreItemView f12189Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0O0 f12190Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ImageMoreItemView f12191Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ImageMoreItemView f12192Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ImageMoreItemView f12193OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ImageMoreItemView f12194OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ImageMoreItemView f12195OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ImageMoreItemView f12196OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ImageMoreItemView f12197OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ImageMoreItemView f12198OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public List<ImageMoreItemView> f12199OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public List<ImageMoreItemView> f12200OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public List<ImageView9GridModel> f12201OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public Map<Integer, ImageMoreItemView> f12202OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f12203Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f12204Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public OooO00o f12205OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public ArrayList<String> f12206OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public SparseArray<ImageView> f12207OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public ArrayList<ImageMoreItemView> f12208Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public ArrayList<ImageView> f12209Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ImageMoreItemView f12210o000oOoO;

    public class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            ImageMoreView.this.onClickNotDouble(view);
        }
    }

    public interface OooO0O0 {
        void OooO00o(int i);
    }

    public ImageMoreView(Context context) {
        this(context, null);
    }

    private int getMax() {
        return OooOo00.OooO00o(((this.f12204Ooooo0o ? 96 : 106) * 2) + 6);
    }

    private int getMin() {
        return OooOo00.OooO00o(this.f12204Ooooo0o ? 96.0f : 106.0f);
    }

    public final View OooO0O0(int i) {
        return p148o00Oo0O.o00Oo0.OooO00o(this, i, getNoDoubleClickListener());
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.app.base.view.imageMore.ImageMoreItemView>] */
    public final ArrayList<ImageMoreItemView> OooO0OO(boolean z) {
        if (this.f12208Oooooo == null) {
            this.f12208Oooooo = new ArrayList<>();
        }
        this.f12208Oooooo.clear();
        if (getData() != null) {
            for (int i = 0; i < getData().size(); i++) {
                ImageView9GridModel imageView9GridModel = getData().get(i);
                ImageMoreItemView imageMoreItemView = null;
                if (this.f12202OoooOoo.containsKey(Integer.valueOf(i))) {
                    imageMoreItemView = (ImageMoreItemView) this.f12202OoooOoo.get(Integer.valueOf(i));
                    imageMoreItemView.OooO0OO(true);
                }
                if (!z) {
                    this.f12208Oooooo.add(imageMoreItemView);
                } else if (imageView9GridModel.getGifType() == 1) {
                    this.f12208Oooooo.add(imageMoreItemView);
                }
            }
        }
        return this.f12208Oooooo;
    }

    public final ArrayList OooO0Oo() {
        if (this.f12206OooooOO == null) {
            this.f12206OooooOO = new ArrayList<>();
        }
        this.f12206OooooOO.clear();
        if (getData() != null && !getData().isEmpty()) {
            Iterator<ImageView9GridModel> it = getData().iterator();
            while (it.hasNext()) {
                this.f12206OooooOO.add(CloudImageUtilKt.imgFormat(it.next().getUrl()));
            }
        }
        return this.f12206OooooOO;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.app.base.view.imageMore.ImageMoreItemView>] */
    public final void OooO0o(List<ImageView9GridModel> list, int i) {
        this.f12201OoooOoO = list;
        this.f12203Ooooo00 = i;
        OooO0o0();
        if (list.isEmpty()) {
            return;
        }
        setVisibility(0);
        int size = list.size();
        if (size == 1) {
            ImageView9GridModel imageView9GridModel = this.f12201OoooOoO.get(0);
            this.f12202OoooOoo.put(0, this.f12198OoooOOO);
            if (imageView9GridModel != null) {
                int width = imageView9GridModel.getWidth();
                int height = imageView9GridModel.getHeight();
                double d = width;
                double min = getMin();
                double max = getMax();
                if (height > width) {
                    d = height;
                }
                double d2 = d > max ? max / d : d < min ? min / d : 1.0d;
                int width2 = (int) (((double) imageView9GridModel.getWidth()) * d2);
                int height2 = (int) (((double) imageView9GridModel.getHeight()) * d2);
                this.f12198OoooOOO.setVisibility(0);
                this.f12198OoooOOO.OooO0O0(imageView9GridModel, 0, width2, height2);
                return;
            }
            return;
        }
        if (size != 4) {
            for (int i2 = 0; i2 < this.f12201OoooOoO.size() && i2 <= 8; i2++) {
                ImageView9GridModel imageView9GridModel2 = this.f12201OoooOoO.get(i2);
                ImageMoreItemView imageMoreItemView = (ImageMoreItemView) this.f12199OoooOOo.get(i2);
                this.f12202OoooOoo.put(Integer.valueOf(i2), imageMoreItemView);
                if (imageView9GridModel2 != null && imageMoreItemView != null) {
                    imageMoreItemView.setVisibility(0);
                    imageMoreItemView.OooO0O0(imageView9GridModel2, i2, getMin(), getMin());
                }
            }
            return;
        }
        for (int i3 = 0; i3 < this.f12201OoooOoO.size() && i3 <= 3; i3++) {
            ImageView9GridModel imageView9GridModel3 = this.f12201OoooOoO.get(i3);
            ImageMoreItemView imageMoreItemView2 = (ImageMoreItemView) this.f12200OoooOo0.get(i3);
            this.f12202OoooOoo.put(Integer.valueOf(i3), imageMoreItemView2);
            if (imageView9GridModel3 != null && imageMoreItemView2 != null) {
                imageMoreItemView2.setVisibility(0);
                imageMoreItemView2.OooO0O0(imageView9GridModel3, i3, getMin(), getMin());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    public final void OooO0o0() {
        this.f12198OoooOOO.setVisibility(8);
        this.f12198OoooOOO.OooO00o();
        for (ImageMoreItemView imageMoreItemView : this.f12199OoooOOo) {
            imageMoreItemView.setVisibility(8);
            imageMoreItemView.OooO00o();
        }
        for (ImageMoreItemView imageMoreItemView2 : this.f12200OoooOo0) {
            imageMoreItemView2.setVisibility(8);
            imageMoreItemView2.OooO00o();
        }
    }

    public ArrayList<ImageMoreItemView> getAllGifItemView() {
        return OooO0OO(true);
    }

    public ArrayList<ImageView> getAllImageViewList() {
        if (this.f12209Oooooo0 == null) {
            this.f12209Oooooo0 = new ArrayList<>();
        }
        this.f12209Oooooo0.clear();
        ArrayList<ImageMoreItemView> arrayListOooO0OO = OooO0OO(false);
        for (int i = 0; i < arrayListOooO0OO.size(); i++) {
            this.f12209Oooooo0.add(arrayListOooO0OO.get(i).getImageIv());
        }
        return this.f12209Oooooo0;
    }

    public ArrayList<ImageMoreItemView> getAllItemView() {
        return OooO0OO(false);
    }

    public SparseArray<ImageView> getAllItemViewImageView() {
        if (this.f12207OooooOo == null) {
            this.f12207OooooOo = new SparseArray<>();
        }
        this.f12207OooooOo.clear();
        ArrayList<ImageMoreItemView> arrayListOooO0OO = OooO0OO(false);
        for (int i = 0; i < arrayListOooO0OO.size(); i++) {
            this.f12207OooooOo.append(i, arrayListOooO0OO.get(i).getImageIv());
        }
        return this.f12207OooooOo;
    }

    public int getCount() {
        List<ImageView9GridModel> list = this.f12201OoooOoO;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public List<ImageView9GridModel> getData() {
        return this.f12201OoooOoO;
    }

    public o00Oo0 getNoDoubleClickListener() {
        if (this.f12205OooooO0 == null) {
            this.f12205OooooO0 = new OooO00o();
        }
        return this.f12205OooooO0;
    }

    public int getPosition() {
        return this.f12203Ooooo00;
    }

    public ArrayList<String> getUrlList() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<ImageView9GridModel> it = getData().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUrl());
        }
        return arrayList;
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        OooO0O0 oooO0O0 = this.f12190Oooo0o;
        if (oooO0O0 == null) {
            return;
        }
        try {
            ImageMoreItemView imageMoreItemView = (ImageMoreItemView) view;
            if (imageMoreItemView != null) {
                oooO0O0.OooO00o(imageMoreItemView.getPosition());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setForward(boolean z) {
        this.f12204Ooooo0o = z;
    }

    public void setOnItemClickListener(OooO0O0 oooO0O0) {
        this.f12190Oooo0o = oooO0O0;
    }

    public ImageMoreView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r1v42, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.util.ArrayList, java.util.List<com.app.base.view.imageMore.ImageMoreItemView>] */
    public ImageMoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12199OoooOOo = null;
        this.f12200OoooOo0 = null;
        this.f12201OoooOoO = null;
        this.f12203Ooooo00 = -1;
        this.f12205OooooO0 = null;
        this.f12206OooooOO = new ArrayList<>();
        new ArrayList();
        this.f12207OooooOo = new SparseArray<>();
        this.f12209Oooooo0 = new ArrayList<>();
        this.f12208Oooooo = new ArrayList<>();
        View.inflate(getContext(), R.layout.item_image_more, this);
        this.f12202OoooOoo = new HashMap();
        this.f12198OoooOOO = (ImageMoreItemView) OooO0O0(R.id.item_image_more_1_0);
        this.f12191Oooo0oO = (ImageMoreItemView) OooO0O0(R.id.item_image_more_9_0);
        this.f12192Oooo0oo = (ImageMoreItemView) OooO0O0(R.id.item_image_more_9_1);
        this.f12189Oooo = (ImageMoreItemView) OooO0O0(R.id.item_image_more_9_2);
        this.f12195OoooO00 = (ImageMoreItemView) OooO0O0(R.id.item_image_more_9_3);
        this.f12194OoooO0 = (ImageMoreItemView) OooO0O0(R.id.item_image_more_9_4);
        this.f12196OoooO0O = (ImageMoreItemView) OooO0O0(R.id.item_image_more_9_5);
        this.f12193OoooO = (ImageMoreItemView) OooO0O0(R.id.item_image_more_9_6);
        this.f12197OoooOO0 = (ImageMoreItemView) OooO0O0(R.id.item_image_more_9_7);
        this.f12210o000oOoO = (ImageMoreItemView) OooO0O0(R.id.item_image_more_9_8);
        if (this.f12199OoooOOo == null) {
            ArrayList arrayList = new ArrayList();
            this.f12199OoooOOo = arrayList;
            arrayList.add(this.f12191Oooo0oO);
            this.f12199OoooOOo.add(this.f12192Oooo0oo);
            this.f12199OoooOOo.add(this.f12189Oooo);
            this.f12199OoooOOo.add(this.f12195OoooO00);
            this.f12199OoooOOo.add(this.f12194OoooO0);
            this.f12199OoooOOo.add(this.f12196OoooO0O);
            this.f12199OoooOOo.add(this.f12193OoooO);
            this.f12199OoooOOo.add(this.f12197OoooOO0);
            this.f12199OoooOOo.add(this.f12210o000oOoO);
        }
        if (this.f12200OoooOo0 == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f12200OoooOo0 = arrayList2;
            arrayList2.add(this.f12191Oooo0oO);
            this.f12200OoooOo0.add(this.f12192Oooo0oo);
            this.f12200OoooOo0.add(this.f12195OoooO00);
            this.f12200OoooOo0.add(this.f12194OoooO0);
        }
        OooO0o0();
    }
}
