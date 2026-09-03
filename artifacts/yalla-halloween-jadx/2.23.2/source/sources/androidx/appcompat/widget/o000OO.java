package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.AppEventsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO extends o0000OOO.OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f3271OooOoOO = 0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final SearchView f3272OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final SearchableInfo f3273OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final Context f3274OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f3275OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f3276OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f3277OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f3278OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f3279OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ColorStateList f3280OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f3281OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f3282OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f3283OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f3284OooOoO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f3285OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f3286OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f3287OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f3288OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f3289OooO0o0;

        public OooO00o(View view) {
            this.f3285OooO00o = (TextView) view.findViewById(R.id.text1);
            this.f3286OooO0O0 = (TextView) view.findViewById(R.id.text2);
            this.f3287OooO0OO = (ImageView) view.findViewById(R.id.icon1);
            this.f3288OooO0Oo = (ImageView) view.findViewById(R.id.icon2);
            this.f3289OooO0o0 = (ImageView) view.findViewById(p012OooOo0O.Oooo000.edit_query);
        }
    }

    public o000OO(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f3277OooOOoo = 1;
        this.f3279OooOo0 = -1;
        this.f3281OooOo0O = -1;
        this.f3282OooOo0o = -1;
        this.f3278OooOo = -1;
        this.f3284OooOoO0 = -1;
        this.f3283OooOoO = -1;
        this.f3272OooOOO = searchView;
        this.f3273OooOOOO = searchableInfo;
        this.f3275OooOOo = searchView.getSuggestionCommitIconResId();
        this.f3274OooOOOo = context;
        this.f3276OooOOo0 = weakHashMap;
    }

    public static String OooO(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    @Override // o0000OOO.OooO00o
    public final void OooO0O0(View view, Cursor cursor) throws FileNotFoundException {
        int i;
        Drawable drawableOooO0oO;
        Drawable drawable;
        CharSequence charSequenceOooO;
        OooO00o oooO00o = (OooO00o) view.getTag();
        int i2 = this.f3283OooOoO;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        TextView textView = oooO00o.f3285OooO00o;
        if (textView != null) {
            String strOooO = OooO(cursor, this.f3279OooOo0);
            textView.setText(strOooO);
            if (TextUtils.isEmpty(strOooO)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f3274OooOOOo;
        TextView textView2 = oooO00o.f3286OooO0O0;
        if (textView2 != null) {
            String strOooO2 = OooO(cursor, this.f3282OooOo0o);
            if (strOooO2 != null) {
                if (this.f3280OooOo00 == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(p012OooOo0O.OooOOO0.textColorSearchUrl, typedValue, true);
                    this.f3280OooOo00 = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strOooO2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f3280OooOo00, null), 0, strOooO2.length(), 33);
                charSequenceOooO = spannableString;
            } else {
                charSequenceOooO = OooO(cursor, this.f3281OooOo0O);
            }
            if (TextUtils.isEmpty(charSequenceOooO)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceOooO);
            if (TextUtils.isEmpty(charSequenceOooO)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = oooO00o.f3287OooO0OO;
        if (imageView != null) {
            int i4 = this.f3278OooOo;
            if (i4 == -1) {
                drawableOooO0oO = null;
            } else {
                drawableOooO0oO = OooO0oO(cursor.getString(i4));
                if (drawableOooO0oO == null) {
                    ComponentName searchActivity = this.f3273OooOOOO.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.f3276OooOOo0;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = weakHashMap.get(strFlattenToShortString);
                        drawableOooO0oO = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Invalid icon resource ", iconResource, " for ");
                                    sbOooO0O0.append(searchActivity.flattenToShortString());
                                    Log.w("SuggestionsAdapter", sbOooO0O0.toString());
                                    drawable = null;
                                }
                            } else {
                                drawable = null;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("SuggestionsAdapter", e.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawable == null ? null : drawable.getConstantState());
                        drawableOooO0oO = drawable;
                    }
                    if (drawableOooO0oO == null) {
                        drawableOooO0oO = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableOooO0oO);
            if (drawableOooO0oO == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableOooO0oO.setVisible(false, false);
                drawableOooO0oO.setVisible(true, false);
            }
        }
        ImageView imageView2 = oooO00o.f3288OooO0Oo;
        if (imageView2 == null) {
            i = 1;
        } else {
            int i5 = this.f3284OooOoO0;
            Drawable drawableOooO0oO2 = i5 == -1 ? null : OooO0oO(cursor.getString(i5));
            imageView2.setImageDrawable(drawableOooO0oO2);
            if (drawableOooO0oO2 == null) {
                imageView2.setVisibility(8);
                i = 1;
            } else {
                imageView2.setVisibility(0);
                drawableOooO0oO2.setVisible(false, false);
                i = 1;
                drawableOooO0oO2.setVisible(true, false);
            }
        }
        int i6 = this.f3277OooOOoo;
        ImageView imageView3 = oooO00o.f3289OooO0o0;
        if (i6 != 2 && (i6 != i || (i3 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // o0000OOO.OooO00o
    public final void OooO0OO(Cursor cursor) {
        try {
            super.OooO0OO(cursor);
            if (cursor != null) {
                this.f3279OooOo0 = cursor.getColumnIndex("suggest_text_1");
                this.f3281OooOo0O = cursor.getColumnIndex("suggest_text_2");
                this.f3282OooOo0o = cursor.getColumnIndex("suggest_text_2_url");
                this.f3278OooOo = cursor.getColumnIndex("suggest_icon_1");
                this.f3284OooOoO0 = cursor.getColumnIndex("suggest_icon_2");
                this.f3283OooOoO = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // o0000OOO.OooO00o
    public final String OooO0Oo(Cursor cursor) {
        String strOooO;
        String strOooO2;
        if (cursor == null) {
            return null;
        }
        String strOooO3 = OooO(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strOooO3 != null) {
            return strOooO3;
        }
        SearchableInfo searchableInfo = this.f3273OooOOOO;
        if (searchableInfo.shouldRewriteQueryFromData() && (strOooO2 = OooO(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strOooO2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strOooO = OooO(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strOooO;
    }

    public final Drawable OooO0o(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(o0000O0O.OooO00o("No authority: ", uri));
        }
        try {
            Resources resourcesForApplication = this.f3274OooOOOo.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(o0000O0O.OooO00o("No path: ", uri));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(o0000O0O.OooO00o("Single path segment is not a resource ID: ", uri));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(o0000O0O.OooO00o("More than two path segments: ", uri));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(o0000O0O.OooO00o("No resource found for: ", uri));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(o0000O0O.OooO00o("No package found for authority: ", uri));
        }
    }

    @Override // o0000OOO.OooO00o
    public final View OooO0o0(ViewGroup viewGroup) {
        View viewInflate = this.f33623OooOOO0.inflate(this.f33621OooOO0O, viewGroup, false);
        viewInflate.setTag(new OooO00o(viewInflate));
        ((ImageView) viewInflate.findViewById(p012OooOo0O.Oooo000.edit_query)).setImageResource(this.f3275OooOOo);
        return viewInflate;
    }

    public final Drawable OooO0oO(String str) throws FileNotFoundException {
        WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.f3276OooOOo0;
        Context context = this.f3274OooOOOo;
        Drawable drawableOooO0o = null;
        if (str != null && !str.isEmpty() && !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Object obj = ContextCompat.f5281OooO00o;
                Drawable drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(context, i);
                if (drawableOooO0O0 != null) {
                    weakHashMap.put(str2, drawableOooO0O0.getConstantState());
                }
                return drawableOooO0O0;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableOooO0o = OooO0o(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                            }
                            drawableOooO0o = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e2) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e3) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
                }
                if (drawableOooO0o != null) {
                    weakHashMap.put(str, drawableOooO0o.getConstantState());
                }
            }
        }
        return drawableOooO0o;
    }

    public final Cursor OooO0oo(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f3274OooOOOo.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // o0000OOO.OooO00o, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.f33623OooOOO0.inflate(this.f33622OooOO0o, viewGroup, false);
            if (viewInflate != null) {
                ((OooO00o) viewInflate.getTag()).f3285OooO00o.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // o0000OOO.OooO00o, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewOooO0o0 = OooO0o0(viewGroup);
            ((OooO00o) viewOooO0o0.getTag()).f3285OooO00o.setText(e.toString());
            return viewOooO0o0;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f33613OooO0o;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f33613OooO0o;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3272OooOOO.OooOOo((CharSequence) tag);
        }
    }
}
