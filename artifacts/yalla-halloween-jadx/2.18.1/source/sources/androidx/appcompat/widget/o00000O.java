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
import com.facebook.appevents.AppEventsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O extends o000O.OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final /* synthetic */ int f5321o0OoOo0 = 0;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final SearchView f5322OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final SearchableInfo f5323OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final Context f5324OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f5325OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final int f5326Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f5327Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public ColorStateList f5328OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f5329OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f5330OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f5331Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f5332Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f5333OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f5334Ooooooo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f5335OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f5336OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f5337OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f5338OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f5339OooO0o0;

        public OooO00o(View view) {
            this.f5335OooO00o = (TextView) view.findViewById(R.id.text1);
            this.f5336OooO0O0 = (TextView) view.findViewById(R.id.text2);
            this.f5337OooO0OO = (ImageView) view.findViewById(R.id.icon1);
            this.f5338OooO0Oo = (ImageView) view.findViewById(R.id.icon2);
            this.f5339OooO0o0 = (ImageView) view.findViewById(OooOo00.OooOO0.edit_query);
        }
    }

    public o00000O(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f5327Ooooo0o = 1;
        this.f5329OooooOO = -1;
        this.f5330OooooOo = -1;
        this.f5332Oooooo0 = -1;
        this.f5331Oooooo = -1;
        this.f5333OoooooO = -1;
        this.f5334Ooooooo = -1;
        this.f5322OoooOOo = searchView;
        this.f5323OoooOo0 = searchableInfo;
        this.f5326Ooooo00 = searchView.getSuggestionCommitIconResId();
        this.f5324OoooOoO = context;
        this.f5325OoooOoo = weakHashMap;
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

    @Override // o000O.OooO00o
    public final void OooO0O0(View view, Cursor cursor) {
        Drawable drawableOooO0oO;
        Drawable drawable;
        CharSequence charSequenceOooO;
        OooO00o oooO00o = (OooO00o) view.getTag();
        int i = this.f5334Ooooooo;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (oooO00o.f5335OooO00o != null) {
            String strOooO = OooO(cursor, this.f5329OooooOO);
            TextView textView = oooO00o.f5335OooO00o;
            textView.setText(strOooO);
            if (TextUtils.isEmpty(strOooO)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        if (oooO00o.f5336OooO0O0 != null) {
            String strOooO2 = OooO(cursor, this.f5332Oooooo0);
            if (strOooO2 != null) {
                if (this.f5328OooooO0 == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f5324OoooOoO.getTheme().resolveAttribute(OooOo00.OooO00o.textColorSearchUrl, typedValue, true);
                    this.f5328OooooO0 = this.f5324OoooOoO.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strOooO2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f5328OooooO0, null), 0, strOooO2.length(), 33);
                charSequenceOooO = spannableString;
            } else {
                charSequenceOooO = OooO(cursor, this.f5330OooooOo);
            }
            if (TextUtils.isEmpty(charSequenceOooO)) {
                TextView textView2 = oooO00o.f5335OooO00o;
                if (textView2 != null) {
                    textView2.setSingleLine(false);
                    oooO00o.f5335OooO00o.setMaxLines(2);
                }
            } else {
                TextView textView3 = oooO00o.f5335OooO00o;
                if (textView3 != null) {
                    textView3.setSingleLine(true);
                    oooO00o.f5335OooO00o.setMaxLines(1);
                }
            }
            TextView textView4 = oooO00o.f5336OooO0O0;
            textView4.setText(charSequenceOooO);
            if (TextUtils.isEmpty(charSequenceOooO)) {
                textView4.setVisibility(8);
            } else {
                textView4.setVisibility(0);
            }
        }
        ImageView imageView = oooO00o.f5337OooO0OO;
        if (imageView != null) {
            int i3 = this.f5331Oooooo;
            if (i3 == -1) {
                drawableOooO0oO = null;
            } else {
                drawableOooO0oO = OooO0oO(cursor.getString(i3));
                if (drawableOooO0oO == null) {
                    ComponentName searchActivity = this.f5323OoooOo0.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    if (this.f5325OoooOoo.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = this.f5325OoooOoo.get(strFlattenToShortString);
                        drawableOooO0oO = constantState == null ? null : constantState.newDrawable(this.f5324OoooOoO.getResources());
                    } else {
                        PackageManager packageManager = this.f5324OoooOoO.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbOooO00o = o00000O0.OooO00o("Invalid icon resource ", iconResource, " for ");
                                    sbOooO00o.append(searchActivity.flattenToShortString());
                                    Log.w("SuggestionsAdapter", sbOooO00o.toString());
                                    drawable = null;
                                }
                            } else {
                                drawable = null;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("SuggestionsAdapter", e.toString());
                        }
                        this.f5325OoooOoo.put(strFlattenToShortString, drawable == null ? null : drawable.getConstantState());
                        drawableOooO0oO = drawable;
                    }
                    if (drawableOooO0oO == null) {
                        drawableOooO0oO = this.f5324OoooOoO.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            OooOO0(imageView, drawableOooO0oO, 4);
        }
        ImageView imageView2 = oooO00o.f5338OooO0Oo;
        if (imageView2 != null) {
            int i4 = this.f5333OoooooO;
            OooOO0(imageView2, i4 == -1 ? null : OooO0oO(cursor.getString(i4)), 8);
        }
        int i5 = this.f5327Ooooo0o;
        if (i5 != 2 && (i5 != 1 || (i2 & 1) == 0)) {
            oooO00o.f5339OooO0o0.setVisibility(8);
            return;
        }
        oooO00o.f5339OooO0o0.setVisibility(0);
        oooO00o.f5339OooO0o0.setTag(oooO00o.f5335OooO00o.getText());
        oooO00o.f5339OooO0o0.setOnClickListener(this);
    }

    @Override // o000O.OooO00o
    public final void OooO0OO(Cursor cursor) {
        try {
            super.OooO0OO(cursor);
            if (cursor != null) {
                this.f5329OooooOO = cursor.getColumnIndex("suggest_text_1");
                this.f5330OooooOo = cursor.getColumnIndex("suggest_text_2");
                this.f5332Oooooo0 = cursor.getColumnIndex("suggest_text_2_url");
                this.f5331Oooooo = cursor.getColumnIndex("suggest_icon_1");
                this.f5333OoooooO = cursor.getColumnIndex("suggest_icon_2");
                this.f5334Ooooooo = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // o000O.OooO00o
    public final CharSequence OooO0Oo(Cursor cursor) {
        String strOooO;
        String strOooO2;
        if (cursor == null) {
            return null;
        }
        String strOooO3 = OooO(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strOooO3 != null) {
            return strOooO3;
        }
        if (this.f5323OoooOo0.shouldRewriteQueryFromData() && (strOooO2 = OooO(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strOooO2;
        }
        if (!this.f5323OoooOo0.shouldRewriteQueryFromText() || (strOooO = OooO(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strOooO;
    }

    public final Drawable OooO0o(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f5324OoooOoO.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    @Override // o000O.OooO00o
    public final View OooO0o0(ViewGroup viewGroup) {
        View viewInflate = this.f28039OoooOOO.inflate(this.f28038OoooOO0, viewGroup, false);
        viewInflate.setTag(new OooO00o(viewInflate));
        ((ImageView) viewInflate.findViewById(OooOo00.OooOO0.edit_query)).setImageResource(this.f5326Ooooo00);
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0132  */
    public final Drawable OooO0oO(String str) {
        Drawable drawableOooO0o = null;
        if (str != null && !str.isEmpty() && !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + this.f5324OoooOoO.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = this.f5325OoooOoo.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Context context = this.f5324OoooOoO;
                Object obj = o000O000.OooO00o.f28085OooO00o;
                Drawable drawableOooO0O0 = o000O000.OooO00o.OooO0OO.OooO0O0(context, i);
                if (drawableOooO0O0 != null) {
                    this.f5325OoooOoo.put(str2, drawableOooO0O0.getConstantState());
                }
                return drawableOooO0O0;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = this.f5325OoooOoo.get(str);
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
                        InputStream inputStreamOpenInputStream = this.f5324OoooOoO.getContentResolver().openInputStream(uri);
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
                    if (drawableOooO0o != null) {
                        this.f5325OoooOoo.put(str, drawableOooO0o.getConstantState());
                    }
                    return drawableOooO0o;
                }
                if (drawableOooO0o != null) {
                    this.f5325OoooOoo.put(str, drawableOooO0o.getConstantState());
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
        return this.f5324OoooOoO.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr, null);
    }

    public final void OooOO0(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // o000O.OooO00o, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.f28039OoooOOO.inflate(this.f28040o000oOoO, viewGroup, false);
            if (viewInflate != null) {
                ((OooO00o) viewInflate.getTag()).f5335OooO00o.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // o000O.OooO00o, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewOooO0o0 = OooO0o0(viewGroup);
            ((OooO00o) viewOooO0o0.getTag()).f5335OooO00o.setText(e.toString());
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
        Cursor cursor = this.f28030Oooo0oo;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f28030Oooo0oo;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f5322OoooOOo.OooOOo((CharSequence) tag);
        }
    }
}
