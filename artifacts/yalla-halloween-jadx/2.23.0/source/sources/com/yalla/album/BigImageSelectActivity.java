package com.yalla.album;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000O;
import androidx.core.view.o000O0Oo;
import androidx.core.view.o000OO00;
import androidx.core.view.o0oOOo;
import androidx.viewpager2.widget.ViewPager2;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.facebook.share.internal.ShareConstants;
import com.yalla.album.AlbumActivity;
import com.yalla.album.BigImageSelectActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o0OO0.OooO;
import o0OO0.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p052o00000oO.OooOO0O;
import p358o0OOOooO.o0000O0;
import p358o0OOOooO.o0000O00;
import p358o0OOOooO.o0000oo;
import p358o0OOOooO.o000O000;
import p358o0OOOooO.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/album/BigImageSelectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "LibSelectPicture_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBigImageSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigImageSelectActivity.kt\ncom/yalla/album/BigImageSelectActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Viewpage2Ext.kt\ncom/app/selectPicture/utils/Viewpage2ExtKt\n+ 4 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,224:1\n766#2:225\n857#2,2:226\n7#3,6:228\n41#4,2:234\n115#4:236\n74#4,4:237\n43#4:241\n*S KotlinDebug\n*F\n+ 1 BigImageSelectActivity.kt\ncom/yalla/album/BigImageSelectActivity\n*L\n107#1:225\n107#1:226,2\n206#1:228,6\n212#1:234,2\n218#1:236\n218#1:237,4\n212#1:241\n*E\n"})
public final class BigImageSelectActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public static WeakReference<AlbumActivity> f22515OooOOOO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ViewGroup f22516OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextView f22520OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o0oOOo f22521OooOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f22524OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f22525OooOOO0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f22518OooO0o0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f22517OooO0o = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public List<AlbumItem> f22519OooO0oO = new ArrayList();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f22522OooOO0O = LazyKt.lazy(OooO00o.f22526OooO0Oo);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f22523OooOO0o = 1;

    public static final class OooO00o extends Lambda implements Function0<o000O000> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f22526OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O000 invoke() {
            return new o000O000();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<TextView> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) BigImageSelectActivity.this.findViewById(o0OO0.OooO0OO.activity_show_images_num);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<ViewPager2> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewPager2 invoke() {
            return (ViewPager2) BigImageSelectActivity.this.findViewById(o0OO0.OooO0OO.activity_show_images_recyclerView);
        }
    }

    @NotNull
    public final ViewPager2 OooOOO() {
        Object value = this.f22517OooO0o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-viewPager>(...)");
        return (ViewPager2) value;
    }

    public final TextView OooOOO0() {
        Object value = this.f22518OooO0o0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-mNumTv>(...)");
        return (TextView) value;
    }

    public final void OooOOOO() {
        AlbumActivity albumActivity;
        TextView textViewOooOOO0 = OooOOO0();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(OooO.select_picture_string_Selected));
        spannableStringBuilder.append((CharSequence) "(");
        WeakReference<AlbumActivity> weakReference = f22515OooOOOO;
        int size = (weakReference == null || (albumActivity = weakReference.get()) == null) ? 0 : albumActivity.OooOOO().getMultiSelectedData().size() + albumActivity.f22492OooO;
        int i = o0OO0.OooO00o.select_picture_color_FF00C0B3;
        Object obj = ContextCompat.f5271OooO00o;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.OooO0o.OooO00o(this, i));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) String.valueOf(size));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) ("/" + this.f22523OooOO0o + ")"));
        textViewOooOOO0.setText(new SpannedString(spannableStringBuilder));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        AlbumActivity albumActivity;
        super.onCreate(bundle);
        setContentView(OooO0o.activity_show_images);
        o0oOOo o0oooo = new o0oOOo(getWindow().getDecorView(), getWindow());
        this.f22521OooOO0 = o0oooo;
        o0oooo.f5453OooO00o.OooO0o();
        int i = 0;
        o000OO00.OooO00o(getWindow(), false);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        this.f22523OooOO0o = getIntent().getIntExtra("MaxCount", 1);
        this.f22525OooOOO0 = getIntent().getIntExtra("File_Index", 0);
        WeakReference<AlbumActivity> weakReference = f22515OooOOOO;
        if (weakReference != null && (albumActivity = weakReference.get()) != null) {
            List<AlbumItem> data = albumActivity.f22495OooO0oO.get(albumActivity.f22499OooOO0o).getData();
            ArrayList arrayList = new ArrayList();
            for (Object obj : data) {
                if (((AlbumItem) obj).isImage()) {
                    arrayList.add(obj);
                }
            }
            List<AlbumItem> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            this.f22519OooO0oO = mutableList;
            this.f22525OooOOO0 = mutableList.indexOf(albumActivity.f22495OooO0oO.get(albumActivity.f22499OooOO0o).getData().get(this.f22525OooOOO0));
        }
        ImageView imageView = (ImageView) findViewById(o0OO0.OooO0OO.picture_left);
        TextView textView = (TextView) findViewById(o0OO0.OooO0OO.picture_right);
        View viewFindViewById = findViewById(o0OO0.OooO0OO.picture_middle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.picture_middle)");
        this.f22520OooO0oo = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(o0OO0.OooO0OO.picture_title_bar_parent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.picture_title_bar_parent)");
        this.f22516OooO = (ViewGroup) viewFindViewById2;
        imageView.setOnClickListener(new o0000O00(this, i));
        textView.setOnClickListener(new o0000oo(this, i));
        TextView textView2 = this.f22520OooO0oo;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_TITLE);
            textView2 = null;
        }
        textView2.setText((this.f22525OooOOO0 + 1) + "/" + this.f22519OooO0oO.size());
        OooOOOO();
        OooOOO().setAdapter(new o000OO(this, OooO0o.layout_show_image_select, this.f22519OooO0oO));
        OooOOO().setCurrentItem(this.f22525OooOOO0, false);
        OooOOO().registerOnPageChangeCallback(new o0000O0(this));
        View decorView = getWindow().getDecorView();
        o000000O o000000o2 = new o000000O() { // from class: o0OOOooO.o0000
            @Override // androidx.core.view.o000000O
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
                WeakReference<AlbumActivity> weakReference2 = BigImageSelectActivity.f22515OooOOOO;
                BigImageSelectActivity this$0 = this.f43764OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(insets, "insets");
                OooOO0O oooOO0OOooO00o = insets.OooO00o(7);
                Intrinsics.checkNotNullExpressionValue(oooOO0OOooO00o, "insets.getInsets(\n      …ationBars()\n            )");
                ViewGroup viewGroup = this$0.f22516OooO;
                if (viewGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleBarParent");
                    viewGroup = null;
                }
                viewGroup.setPadding(0, com.android.billingclient.api.o000O000.OooO00o(14.0f) + oooOO0OOooO00o.f33990OooO0O0, 0, com.android.billingclient.api.o000O000.OooO00o(14.0f));
                this$0.OooOOO0().setPaddingRelative(0, com.android.billingclient.api.o000O000.OooO00o(13.0f), com.android.billingclient.api.o000O000.OooO00o(16.0f), com.android.billingclient.api.o000O000.OooO00o(13.0f) + oooOO0OOooO00o.f33992OooO0Oo);
                return insets;
            }
        };
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOOO.OooOo0(decorView, o000000o2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        WeakReference<AlbumActivity> weakReference = f22515OooOOOO;
        if (weakReference != null) {
            weakReference.clear();
        }
        f22515OooOOOO = null;
        super.onDestroy();
    }
}
