package com.yalla.album;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.android.billingclient.api.o0000O0O;
import com.app.selectPicture.view.photoview.PhotoView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.album.PreviewImageActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o0OO0O0.OooO00o;
import o0OO0O0.OooO0OO;
import org.jetbrains.annotations.Nullable;
import p138o00OOOo.OooO0o;
import p139o00OOOo0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/album/PreviewImageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "LibSelectPicture_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPreviewImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewImageActivity.kt\ncom/yalla/album/PreviewImageActivity\n+ 2 Viewpage2Ext.kt\ncom/app/selectPicture/utils/Viewpage2ExtKt\n*L\n1#1,76:1\n7#2,6:77\n*S KotlinDebug\n*F\n+ 1 PreviewImageActivity.kt\ncom/yalla/album/PreviewImageActivity\n*L\n71#1:77,6\n*E\n"})
public final class PreviewImageActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f22065OooO0o0 = 0;

    @SourceDebugExtension({"SMAP\nPreviewImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewImageActivity.kt\ncom/yalla/album/PreviewImageActivity$onCreate$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,76:1\n260#2,4:77\n260#2:81\n*S KotlinDebug\n*F\n+ 1 PreviewImageActivity.kt\ncom/yalla/album/PreviewImageActivity$onCreate$2$1\n*L\n62#1:77,4\n63#1:81\n*E\n"})
    public static final class OooO00o extends BaseQuickAdapter<String, BaseViewHolder> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ ViewPager2 f22066OooOo;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ PreviewImageActivity f22067OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f22068OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ArrayList<String> arrayList, ViewPager2 viewPager2, ViewGroup viewGroup, PreviewImageActivity previewImageActivity, int i) {
            super(i, arrayList);
            this.f22066OooOo = viewPager2;
            this.f22068OooOoO0 = viewGroup;
            this.f22067OooOoO = previewImageActivity;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder helper, String str) {
            String item = str;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            helper.setGone(OooO0OO.layout_show_image_select_tv_select, false);
            PhotoView photoView = (PhotoView) helper.getView(OooO0OO.layout_show_image_select_pic_iv);
            if (OooOO0.f37472OooO00o == null) {
                OooOO0.f37472OooO00o = new o0000O0O();
            }
            OooO0o oooO0o = OooOO0.f37472OooO00o;
            final ViewPager2 viewPager2 = this.f22066OooOo;
            oooO0o.OooO00o(viewPager2.getContext(), item, photoView);
            final ViewGroup viewGroup = this.f22068OooOoO0;
            final PreviewImageActivity previewImageActivity = this.f22067OooOoO;
            photoView.setOnClickListener(new View.OnClickListener() { // from class: o0OOOooo.o00O000
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int iOooO00o;
                    PreviewImageActivity this$0 = previewImageActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    ViewPager2 this_apply = viewPager2;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    ViewGroup viewGroup2 = viewGroup;
                    Intrinsics.checkNotNull(viewGroup2);
                    viewGroup2.setVisibility((viewGroup2.getVisibility() == 0) ^ true ? 0 : 8);
                    Window window = this$0.getWindow();
                    if (viewGroup2.getVisibility() == 0) {
                        Context context = this_apply.getContext();
                        int i = OooO00o.select_picture_color_FF161619;
                        Object obj = ContextCompat.f5281OooO00o;
                        iOooO00o = ContextCompat.OooO0o.OooO00o(context, i);
                    } else {
                        Context context2 = this_apply.getContext();
                        int i2 = OooO00o.select_picture_color_ff000000;
                        Object obj2 = ContextCompat.f5281OooO00o;
                        iOooO00o = ContextCompat.OooO0o.OooO00o(context2, i2);
                    }
                    window.setStatusBarColor(iOooO00o);
                }
            });
        }
    }

    @SourceDebugExtension({"SMAP\nViewpage2Ext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Viewpage2Ext.kt\ncom/app/selectPicture/utils/Viewpage2ExtKt$doOnPageChange$1\n+ 2 PreviewImageActivity.kt\ncom/yalla/album/PreviewImageActivity\n*L\n1#1,13:1\n72#2,2:14\n*E\n"})
    public static final class OooO0O0 extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ TextView f22069OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f22070OooO0O0;

        public OooO0O0(TextView textView, ArrayList arrayList) {
            this.f22069OooO00o = textView;
            this.f22070OooO0O0 = arrayList;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i) {
            this.f22069OooO00o.setText((i + 1) + "/" + this.f22070OooO0O0.size());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i = o0OO0O0.OooO00o.select_picture_color_FF161619;
        Object obj = ContextCompat.f5281OooO00o;
        window.setStatusBarColor(ContextCompat.OooO0o.OooO00o(this, i));
        getWindow().setNavigationBarColor(ContextCompat.OooO0o.OooO00o(this, i));
        setContentView(o0OO0O0.OooO0o.activity_preview_images);
        int intExtra = getIntent().getIntExtra("File_Index", 0);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("data");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            finish();
            return;
        }
        findViewById(OooO0OO.picture_left).setOnClickListener(new View.OnClickListener() { // from class: o0OOOooo.o00oOoo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = PreviewImageActivity.f22065OooO0o0;
                PreviewImageActivity this$0 = this.f43000OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
            }
        });
        TextView textView = (TextView) findViewById(OooO0OO.picture_middle);
        textView.setText((intExtra + 1) + "/" + stringArrayListExtra.size());
        ViewGroup viewGroup = (ViewGroup) findViewById(OooO0OO.picture_title_bar_parent);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(OooO0OO.viewpager2);
        if (viewPager2 != null) {
            viewPager2.setAdapter(new OooO00o(stringArrayListExtra, viewPager2, viewGroup, this, o0OO0O0.OooO0o.layout_show_image_select));
            viewPager2.setCurrentItem(intExtra, false);
            viewPager2.registerOnPageChangeCallback(new OooO0O0(textView, stringArrayListExtra));
        }
    }
}
