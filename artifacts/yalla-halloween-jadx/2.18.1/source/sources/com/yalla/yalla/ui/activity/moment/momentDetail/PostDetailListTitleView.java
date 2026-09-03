package com.yalla.yalla.ui.activity.moment.momentDetail;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import o00Oo00.OooO0OO;
import p168o00Ooo0.o0O0O00;
import p522o0o0O0o.oo0o0O0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public class PostDetailListTitleView extends RelativeLayout implements o00Oo00.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ImageView f22698Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f22699Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ImageView f22700Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f22701Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Drawable f22702OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ImageView f22703OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f22704OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Drawable f22705OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Drawable f22706OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Drawable f22707OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public Drawable f22708OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public OooO00o f22709OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public OooO0OO<Integer> f22710OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Drawable f22711o000oOoO;

    public class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            PostDetailListTitleView.this.onClickNotDouble(view);
        }
    }

    public PostDetailListTitleView(Context context) {
        this(context, null);
    }

    public final View OooO00o(int i) {
        return p148o00Oo0O.o00Oo0.OooO00o(this, i, getNoDoubleClickListener());
    }

    public final void OooO0O0() {
        this.f22699Oooo0o.setTextColor(OooOOO.OooO00o(R.color.color_38000000));
        this.f22701Oooo0oo.setTextColor(OooOOO.OooO00o(R.color.color_38000000));
        this.f22704OoooO00.setTextColor(OooOOO.OooO00o(R.color.color_38000000));
    }

    public final void OooO0OO() {
        this.f22700Oooo0oO.setVisibility(4);
        oo0o0O0.OooO0oo(this.f22699Oooo0o, this.f22705OoooO0O);
        this.f22698Oooo.setVisibility(4);
        oo0o0O0.OooO0oo(this.f22701Oooo0oo, this.f22706OoooOO0);
        this.f22703OoooO0.setVisibility(4);
        oo0o0O0.OooO0oo(this.f22704OoooO00, this.f22707OoooOOO);
    }

    public o00Oo0 getNoDoubleClickListener() {
        if (this.f22709OoooOo0 == null) {
            this.f22709OoooOo0 = new OooO00o();
        }
        return this.f22709OoooOo0;
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        OooO0OO<Integer> oooO0OO;
        int id = view.getId();
        if (id == R.id.item_post_detail_viewPager_comment_layout || id == R.id.item_post_detail_viewPager_comment_name || id == R.id.item_post_detail_viewPager_comment_line) {
            OooO0OO<Integer> oooO0OO2 = this.f22710OoooOoO;
            if (oooO0OO2 != null) {
                oooO0OO2.OooO00o(0);
                return;
            }
            return;
        }
        if (id == R.id.item_post_detail_viewPager_praise_layout || id == R.id.item_post_detail_viewPager_praise_name || id == R.id.item_post_detail_viewPager_praise_line) {
            OooO0OO<Integer> oooO0OO3 = this.f22710OoooOoO;
            if (oooO0OO3 != null) {
                oooO0OO3.OooO00o(1);
                return;
            }
            return;
        }
        if ((id == R.id.item_post_detail_viewPager_gift_layout || id == R.id.item_post_detail_viewPager_gift_name || id == R.id.item_post_detail_viewPager_gift_line) && (oooO0OO = this.f22710OoooOoO) != null) {
            oooO0OO.OooO00o(2);
        }
    }

    public void setCommentCount(long j) {
        this.f22699Oooo0o.setText(o0O0O00.OooO0oO(j, false));
    }

    public void setCurrentItem(int i) {
        OooO0OO();
        OooO0O0();
        if (i == 0) {
            this.f22700Oooo0oO.setVisibility(0);
            oo0o0O0.OooO0oo(this.f22699Oooo0o, this.f22702OoooO);
            this.f22699Oooo0o.setTextColor(OooOOO.OooO00o(R.color.color_87000000));
        } else if (i == 1) {
            this.f22698Oooo.setVisibility(0);
            oo0o0O0.OooO0oo(this.f22701Oooo0oo, this.f22711o000oOoO);
            this.f22701Oooo0oo.setTextColor(OooOOO.OooO00o(R.color.color_87000000));
        } else if (i == 2) {
            this.f22703OoooO0.setVisibility(0);
            oo0o0O0.OooO0oo(this.f22704OoooO00, this.f22708OoooOOo);
            this.f22704OoooO00.setTextColor(OooOOO.OooO00o(R.color.color_87000000));
        }
    }

    public void setGiftTotalPropValue(long j) {
        this.f22704OoooO00.setText(o0O0O00.OooO0oO(j, false));
    }

    public void setItemListener(OooO0OO<Integer> oooO0OO) {
        this.f22710OoooOoO = oooO0OO;
    }

    public void setPraiseCount(long j) {
        this.f22701Oooo0oo.setText(o0O0O00.OooO0oO(j, false));
    }

    public PostDetailListTitleView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PostDetailListTitleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22709OoooOo0 = null;
        View.inflate(getContext(), R.layout.item_post_detail_list_title_view, this);
        OooO00o(R.id.item_post_detail_viewPager_comment_layout);
        this.f22699Oooo0o = (TextView) OooO00o(R.id.item_post_detail_viewPager_comment_name);
        this.f22700Oooo0oO = (ImageView) OooO00o(R.id.item_post_detail_viewPager_comment_line);
        OooO00o(R.id.item_post_detail_viewPager_praise_layout);
        this.f22701Oooo0oo = (TextView) OooO00o(R.id.item_post_detail_viewPager_praise_name);
        this.f22698Oooo = (ImageView) OooO00o(R.id.item_post_detail_viewPager_praise_line);
        OooO00o(R.id.item_post_detail_viewPager_gift_layout);
        this.f22703OoooO0 = (ImageView) OooO00o(R.id.item_post_detail_viewPager_gift_line);
        this.f22704OoooO00 = (TextView) OooO00o(R.id.item_post_detail_viewPager_gift_name);
        this.f22702OoooO = OooOOO.OooO0O0(R.drawable.icon_post_detail_comment_black);
        this.f22705OoooO0O = OooOOO.OooO0O0(R.drawable.icon_post_detail_comment_gray);
        this.f22711o000oOoO = OooOOO.OooO0O0(R.drawable.icon_post_detail_praise_black);
        this.f22706OoooOO0 = OooOOO.OooO0O0(R.drawable.icon_post_detail_praise_gray);
        this.f22708OoooOOo = OooOOO.OooO0O0(R.drawable.icon_post_detail_gift_black);
        this.f22707OoooOOO = OooOOO.OooO0O0(R.drawable.icon_post_detail_gift_gray);
        OooO0OO();
        this.f22699Oooo0o.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.f22701Oooo0oo.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.f22704OoooO00.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        OooO0O0();
    }
}
