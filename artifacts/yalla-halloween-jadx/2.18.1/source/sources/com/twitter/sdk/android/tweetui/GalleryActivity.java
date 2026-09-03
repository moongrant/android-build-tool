package com.twitter.sdk.android.tweetui;

import android.app.Activity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.twitter.sdk.android.core.models.MediaEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import p439o0OoOOo0.o00;
import p439o0OoOOo0.o0000O;
import p439o0OoOOo0.o0000OO0;
import p439o0OoOOo0.o000OO;
import p439o0OoOOo0.o000OO00;
import p439o0OoOOo0.o000OO0O;
import p439o0OoOOo0.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public class GalleryActivity extends Activity {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public GalleryItem f20098Oooo0o;

    @Override // android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, o000OO0O.tw__slide_out);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o00O0000.tw__gallery_activity);
        MediaEntity mediaEntity = (MediaEntity) getIntent().getSerializableExtra("MEDIA_ENTITY");
        this.f20098Oooo0o = mediaEntity != null ? new GalleryItem(Collections.singletonList(mediaEntity)) : (GalleryItem) getIntent().getSerializableExtra("GALLERY_ITEM");
        o0000OO0 o0000oo1 = new o0000OO0(this, new o0000O(this));
        o0000oo1.f40135OooO0OO.addAll(this.f20098Oooo0o.f20100Oooo0oO);
        o0000oo1.OooO();
        ViewPager viewPager = (ViewPager) findViewById(o00.tw__view_pager);
        viewPager.setPageMargin(getResources().getDimensionPixelSize(o000OO00.tw__gallery_page_margin));
        viewPager.OooO0O0(new o000OO());
        viewPager.setAdapter(o0000oo1);
        viewPager.setCurrentItem(this.f20098Oooo0o.f20099Oooo0o);
    }

    public static class GalleryItem implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final int f20099Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final List<MediaEntity> f20100Oooo0oO;

        public GalleryItem(long j, int i, List<MediaEntity> list) {
            this.f20099Oooo0o = i;
            this.f20100Oooo0oO = list;
        }

        public GalleryItem(List list) {
            this.f20099Oooo0o = 0;
            this.f20100Oooo0oO = list;
        }
    }
}
