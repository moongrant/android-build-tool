package com.twitter.sdk.android.tweetui;

import android.app.Activity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.twitter.sdk.android.core.models.MediaEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GalleryActivity extends Activity {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public GalleryItem f22272OooO0Oo;

    public static class GalleryItem implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f22273OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final List<MediaEntity> f22274OooO0o0;

        public GalleryItem() {
            throw null;
        }

        public GalleryItem(int i, List list) {
            this.f22273OooO0Oo = i;
            this.f22274OooO0o0 = list;
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, o00oO0o.tw__slide_out);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o0O0O00.tw__gallery_activity);
        MediaEntity mediaEntity = (MediaEntity) getIntent().getSerializableExtra("MEDIA_ENTITY");
        this.f22272OooO0Oo = mediaEntity != null ? new GalleryItem(0, Collections.singletonList(mediaEntity)) : (GalleryItem) getIntent().getSerializableExtra("GALLERY_ITEM");
        OooOo00 oooOo00 = new OooOo00(this, new OooOOOO(this));
        oooOo00.f22320OooO0OO.addAll(this.f22272OooO0Oo.f22274OooO0o0);
        oooOo00.OooO();
        ViewPager viewPager = (ViewPager) findViewById(oo0o0Oo.tw__view_pager);
        viewPager.setPageMargin(getResources().getDimensionPixelSize(o0Oo0oo.tw__gallery_page_margin));
        viewPager.OooO0O0(new OooOOO());
        viewPager.setAdapter(oooOo00);
        viewPager.setCurrentItem(this.f22272OooO0Oo.f22273OooO0Oo);
    }
}
