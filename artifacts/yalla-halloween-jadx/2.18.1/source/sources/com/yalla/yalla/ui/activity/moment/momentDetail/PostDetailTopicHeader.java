package com.yalla.yalla.ui.activity.moment.momentDetail;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import com.yalla.yalla.util.netimage.NetImageView;
import p522o0o0O0o.oo0o0O0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public class PostDetailTopicHeader extends LinearLayout implements o00Oo00.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TopicFollowPostNumberView f22713Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public LinearLayout f22714Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public NetImageView f22715Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f22716Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TopicInfoModel f22717OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public View f22718OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f22719OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Activity f22720OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f22721OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public OooO00o f22722o000oOoO;

    public class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            PostDetailTopicHeader.this.onClickNotDouble(view);
        }
    }

    public PostDetailTopicHeader(Context context) {
        this(context, null);
    }

    public final View OooO00o(int i) {
        return p148o00Oo0O.o00Oo0.OooO00o(this, i, getNoDoubleClickListener());
    }

    public final void OooO0O0() {
        this.f22714Oooo0o.setVisibility(8);
        this.f22718OoooO0.setVisibility(8);
        this.f22715Oooo0oO.setImageDrawable(null);
        oo0o0O0.OooO00o(this.f22716Oooo0oo);
        this.f22716Oooo0oo.setText("");
        this.f22719OoooO00.setText("");
    }

    public Activity getActivity() {
        return this.f22720OoooO0O;
    }

    public TopicInfoModel getData() {
        return this.f22717OoooO;
    }

    public o00Oo0 getNoDoubleClickListener() {
        if (this.f22722o000oOoO == null) {
            this.f22722o000oOoO = new OooO00o();
        }
        return this.f22722o000oOoO;
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if ((id == R.id.item_post_detail_topic_header_layout || id == R.id.item_post_detail_topic_header_iv_head || id == R.id.item_post_detail_topic_header_name_tv || id == R.id.item_post_detail_topic_header_count_tv || id == R.id.item_post_detail_topic_header_info_tv) && getData().getId() > 0) {
            TopicDetailActivity.f22567o0OoOo0.OooO00o(getActivity(), getData());
        }
    }

    public PostDetailTopicHeader(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PostDetailTopicHeader(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22721OoooOO0 = 4;
        this.f22722o000oOoO = null;
        View.inflate(getContext(), R.layout.item_post_detail_topic_header, this);
        this.f22714Oooo0o = (LinearLayout) OooO00o(R.id.item_post_detail_topic_header_layout);
        this.f22715Oooo0oO = (NetImageView) OooO00o(R.id.item_post_detail_topic_header_iv_head);
        this.f22716Oooo0oo = (TextView) OooO00o(R.id.item_post_detail_topic_header_name_tv);
        this.f22713Oooo = (TopicFollowPostNumberView) OooO00o(R.id.item_post_detail_topic_header_count_tv);
        this.f22719OoooO00 = (TextView) OooO00o(R.id.item_post_detail_topic_header_info_tv);
        this.f22718OoooO0 = OooO00o(R.id.item_post_detail_topic_header_line);
        OooO0O0();
    }
}
