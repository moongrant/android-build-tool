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
import androidx.core.view.o0;
import androidx.core.view.o000000O;
import androidx.core.view.o000OOo0;
import androidx.core.view.o00oOoo;
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
import o0OO0O0.OooO;
import o0OO0O0.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p052o00000oO.OooOO0O;
import p361o0OOOooo.o000O;
import p361o0OOOooo.o000O0;
import p361o0OOOooo.o000O00;
import p361o0OOOooo.o000O0o;
import p361o0OOOooo.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/album/BigImageSelectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "LibSelectPicture_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBigImageSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigImageSelectActivity.kt\ncom/yalla/album/BigImageSelectActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Viewpage2Ext.kt\ncom/app/selectPicture/utils/Viewpage2ExtKt\n+ 4 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,239:1\n766#2:240\n857#2,2:241\n7#3,6:243\n41#4,2:249\n115#4:251\n74#4,4:252\n43#4:256\n262#5,2:257\n*S KotlinDebug\n*F\n+ 1 BigImageSelectActivity.kt\ncom/yalla/album/BigImageSelectActivity\n*L\n110#1:240\n110#1:241,2\n220#1:243,6\n227#1:249,2\n233#1:251\n233#1:252,4\n227#1:256\n98#1:257,2\n*E\n"})
public final class BigImageSelectActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public static WeakReference<AlbumActivity> f22042OooOOOO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ViewGroup f22043OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextView f22047OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o0 f22048OooOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f22051OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f22052OooOOO0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f22045OooO0o0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f22044OooO0o = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public List<AlbumItem> f22046OooO0oO = new ArrayList();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f22049OooOO0O = LazyKt.lazy(OooO00o.f22053OooO0Oo);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f22050OooOO0o = 1;

    public static final class OooO00o extends Lambda implements Function0<o000O> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f22053OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O invoke() {
            return new o000O();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<TextView> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) BigImageSelectActivity.this.findViewById(o0OO0O0.OooO0OO.activity_show_images_num);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<ViewPager2> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewPager2 invoke() {
            return (ViewPager2) BigImageSelectActivity.this.findViewById(o0OO0O0.OooO0OO.activity_show_images_recyclerView);
        }
    }

    @NotNull
    public final ViewPager2 OooOOO() {
        Object value = this.f22044OooO0o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewPager2) value;
    }

    public final TextView OooOOO0() {
        Object value = this.f22045OooO0o0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void OooOOOO() {
        AlbumActivity albumActivity;
        TextView textViewOooOOO0 = OooOOO0();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(OooO.select_picture_string_Selected));
        spannableStringBuilder.append((CharSequence) "(");
        WeakReference<AlbumActivity> weakReference = f22042OooOOOO;
        int size = (weakReference == null || (albumActivity = weakReference.get()) == null) ? 0 : albumActivity.OooOOO().getMultiSelectedData().size() + albumActivity.f22019OooO;
        int i = o0OO0O0.OooO00o.select_picture_color_FF00C0B3;
        Object obj = ContextCompat.f5281OooO00o;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.OooO0o.OooO00o(this, i));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) String.valueOf(size));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) ("/" + this.f22050OooOO0o + ")"));
        textViewOooOOO0.setText(new SpannedString(spannableStringBuilder));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        AlbumActivity albumActivity;
        super.onCreate(bundle);
        setContentView(OooO0o.activity_show_images);
        o0 o0Var = new o0(getWindow().getDecorView(), getWindow());
        this.f22048OooOO0 = o0Var;
        o0Var.f5420OooO00o.OooO0o();
        int i = 0;
        o00oOoo.OooO00o(getWindow(), false);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        this.f22050OooOO0o = getIntent().getIntExtra("MaxCount", 1);
        this.f22052OooOOO0 = getIntent().getIntExtra("File_Index", 0);
        WeakReference<AlbumActivity> weakReference = f22042OooOOOO;
        if (weakReference != null && (albumActivity = weakReference.get()) != null) {
            List<AlbumItem> data = albumActivity.f22022OooO0oO.get(albumActivity.f22026OooOO0o).getData();
            ArrayList arrayList = new ArrayList();
            for (Object obj : data) {
                if (((AlbumItem) obj).isImage()) {
                    arrayList.add(obj);
                }
            }
            List<AlbumItem> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            this.f22046OooO0oO = mutableList;
            this.f22052OooOOO0 = mutableList.indexOf(albumActivity.f22022OooO0oO.get(albumActivity.f22026OooOO0o).getData().get(this.f22052OooOOO0));
        }
        ImageView imageView = (ImageView) findViewById(o0OO0O0.OooO0OO.picture_left);
        TextView textView = (TextView) findViewById(o0OO0O0.OooO0OO.picture_right);
        View viewFindViewById = findViewById(o0OO0O0.OooO0OO.picture_middle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f22047OooO0oo = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(o0OO0O0.OooO0OO.picture_title_bar_parent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f22043OooO = (ViewGroup) viewFindViewById2;
        imageView.setOnClickListener(new o000O0o(this, i));
        textView.setOnClickListener(new o000Oo0(this, i));
        String str = (this.f22052OooOOO0 + 1) + "/" + this.f22046OooO0oO.size();
        TextView textView2 = this.f22047OooO0oo;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_TITLE);
            textView2 = null;
        }
        textView2.setText(str);
        OooOOOO();
        OooOOO().setAdapter(new o000O0(this, OooO0o.layout_show_image_select, this.f22046OooO0oO));
        OooOOO().setCurrentItem(this.f22052OooOOO0, false);
        OooOOO().registerOnPageChangeCallback(new o000O00(this));
        View decorView = getWindow().getDecorView();
        o000000O o000000o2 = new o000000O() { // from class: o0OOOooo.o000O000
            @Override // androidx.core.view.o000000O
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
                WeakReference<AlbumActivity> weakReference2 = BigImageSelectActivity.f22042OooOOOO;
                BigImageSelectActivity this$0 = this.f42976OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(insets, "insets");
                OooOO0O oooOO0OOooO00o = insets.OooO00o(7);
                Intrinsics.checkNotNullExpressionValue(oooOO0OOooO00o, "getInsets(...)");
                ViewGroup viewGroup = this$0.f22043OooO;
                if (viewGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleBarParent");
                    viewGroup = null;
                }
                viewGroup.setPadding(0, com.google.gson.internal.OooO.OooO0O0(14.0f) + oooOO0OOooO00o.f33478OooO0O0, 0, com.google.gson.internal.OooO.OooO0O0(14.0f));
                if (this$0.f22050OooOO0o <= 1) {
                    this$0.OooOOO0().setVisibility(8);
                }
                this$0.OooOOO0().setPaddingRelative(0, com.google.gson.internal.OooO.OooO0O0(13.0f), com.google.gson.internal.OooO.OooO0O0(16.0f), com.google.gson.internal.OooO.OooO0O0(13.0f) + oooOO0OOooO00o.f33480OooO0Oo);
                return insets;
            }
        };
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0(decorView, o000000o2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        WeakReference<AlbumActivity> weakReference = f22042OooOOOO;
        if (weakReference != null) {
            weakReference.clear();
        }
        f22042OooOOOO = null;
        super.onDestroy();
    }
}
