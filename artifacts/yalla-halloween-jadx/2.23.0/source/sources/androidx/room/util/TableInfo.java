package androidx.room.util;

import android.annotation.SuppressLint;
import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0O00o0;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class TableInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final String f7922OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Map<String, OooO00o> f7923OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Set<OooO0O0> f7924OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @Nullable
    public final Set<OooO0o> f7925OooO0Oo;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/util/TableInfo$CreatedFrom;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface CreatedFrom {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        @NotNull
        public final String f7926OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @JvmField
        @NotNull
        public final String f7927OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @JvmField
        public final boolean f7928OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @JvmField
        public final int f7929OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @JvmField
        public final int f7930OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @JvmField
        @Nullable
        public final String f7931OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @JvmField
        public final int f7932OooO0oO;

        /* JADX INFO: renamed from: androidx.room.util.TableInfo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0162OooO00o {
            @JvmStatic
            @SuppressLint({"SyntheticAccessor"})
            @VisibleForTesting
            public static boolean OooO00o(@NotNull String current, @Nullable String str) {
                boolean z;
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.areEqual(current, str)) {
                    return true;
                }
                if (!(current.length() == 0)) {
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i >= current.length()) {
                            if (i2 == 0) {
                                z = true;
                                break;
                            }
                        } else {
                            char cCharAt = current.charAt(i);
                            int i4 = i3 + 1;
                            if (i3 != 0 || cCharAt == '(') {
                                if (cCharAt == '(') {
                                    i2++;
                                } else if (cCharAt != ')' || (i2 = i2 - 1) != 0 || i3 == current.length() - 1) {
                                }
                                i++;
                                i3 = i4;
                            }
                        }
                        z = false;
                        break;
                    }
                }
                z = false;
                break;
                if (!z) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Intrinsics.areEqual(StringsKt.trim((CharSequence) strSubstring).toString(), str);
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0057  */
        public OooO00o(int i, int i2, @NotNull String name, @NotNull String type, @Nullable String str, boolean z) {
            int i3;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f7926OooO00o = name;
            this.f7927OooO0O0 = type;
            this.f7928OooO0OO = z;
            this.f7929OooO0Oo = i;
            this.f7931OooO0o0 = str;
            this.f7930OooO0o = i2;
            if (type == null) {
                i3 = 5;
            } else {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String upperCase = type.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                if (StringsKt.OooO0o(upperCase, "INT")) {
                    i3 = 3;
                } else if (StringsKt.OooO0o(upperCase, "CHAR") || StringsKt.OooO0o(upperCase, "CLOB") || StringsKt.OooO0o(upperCase, "TEXT")) {
                    i3 = 2;
                } else if (StringsKt.OooO0o(upperCase, "BLOB")) {
                    i3 = 5;
                } else {
                    i3 = (StringsKt.OooO0o(upperCase, "REAL") || StringsKt.OooO0o(upperCase, "FLOA") || StringsKt.OooO0o(upperCase, "DOUB")) ? 4 : 1;
                }
            }
            this.f7932OooO0oO = i3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
        
            r1 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            if (this.f7929OooO0Oo != oooO00o.f7929OooO0Oo) {
                return false;
            }
            if (!Intrinsics.areEqual(this.f7926OooO00o, oooO00o.f7926OooO00o) || this.f7928OooO0OO != oooO00o.f7928OooO0OO) {
                return false;
            }
            int i = oooO00o.f7930OooO0o;
            String str = oooO00o.f7931OooO0o0;
            String str2 = this.f7931OooO0o0;
            int i2 = this.f7930OooO0o;
            if (i2 == 1 && i == 2 && str2 != null && !C0162OooO00o.OooO00o(str2, str)) {
                return false;
            }
            if (i2 == 2 && i == 1 && str != null && !C0162OooO00o.OooO00o(str, str2)) {
                return false;
            }
            if (i2 != 0 && i2 == i) {
                boolean z = str2 != null ? false : false;
                if (z) {
                    return false;
                }
            }
            return this.f7932OooO0oO == oooO00o.f7932OooO0oO;
        }

        public final int hashCode() {
            return (((((this.f7926OooO00o.hashCode() * 31) + this.f7932OooO0oO) * 31) + (this.f7928OooO0OO ? 1231 : 1237)) * 31) + this.f7929OooO0Oo;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.f7926OooO00o);
            sb.append("', type='");
            sb.append(this.f7927OooO0O0);
            sb.append("', affinity='");
            sb.append(this.f7932OooO0oO);
            sb.append("', notNull=");
            sb.append(this.f7928OooO0OO);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f7929OooO0Oo);
            sb.append(", defaultValue='");
            String str = this.f7931OooO0o0;
            if (str == null) {
                str = "undefined";
            }
            return o0O00o0.OooO0O0(sb, str, "'}");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        @NotNull
        public final String f7933OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @JvmField
        @NotNull
        public final String f7934OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @JvmField
        @NotNull
        public final String f7935OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @JvmField
        @NotNull
        public final List<String> f7936OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @JvmField
        @NotNull
        public final List<String> f7937OooO0o0;

        public OooO0O0(@NotNull String referenceTable, @NotNull String onDelete, @NotNull String onUpdate, @NotNull List<String> columnNames, @NotNull List<String> referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.f7933OooO00o = referenceTable;
            this.f7934OooO0O0 = onDelete;
            this.f7935OooO0OO = onUpdate;
            this.f7936OooO0Oo = columnNames;
            this.f7937OooO0o0 = referenceColumnNames;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (Intrinsics.areEqual(this.f7933OooO00o, oooO0O0.f7933OooO00o) && Intrinsics.areEqual(this.f7934OooO0O0, oooO0O0.f7934OooO0O0) && Intrinsics.areEqual(this.f7935OooO0OO, oooO0O0.f7935OooO0OO) && Intrinsics.areEqual(this.f7936OooO0Oo, oooO0O0.f7936OooO0Oo)) {
                return Intrinsics.areEqual(this.f7937OooO0o0, oooO0O0.f7937OooO0o0);
            }
            return false;
        }

        public final int hashCode() {
            return this.f7937OooO0o0.hashCode() + ((this.f7936OooO0Oo.hashCode() + o0OO00O.OooO00o(this.f7935OooO0OO, o0OO00O.OooO00o(this.f7934OooO0O0, this.f7933OooO00o.hashCode() * 31, 31), 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f7933OooO00o + "', onDelete='" + this.f7934OooO0O0 + " +', onUpdate='" + this.f7935OooO0OO + "', columnNames=" + this.f7936OooO0Oo + ", referenceColumnNames=" + this.f7937OooO0o0 + '}';
        }
    }

    public static final class OooO0OO implements Comparable<OooO0OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f7938OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final String f7939OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f7940OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final String f7941OooO0oO;

        public OooO0OO(int i, int i2, @NotNull String from, @NotNull String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.f7938OooO0Oo = i;
            this.f7940OooO0o0 = i2;
            this.f7939OooO0o = from;
            this.f7941OooO0oO = to;
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO0OO oooO0OO) {
            OooO0OO other = oooO0OO;
            Intrinsics.checkNotNullParameter(other, "other");
            int i = this.f7938OooO0Oo - other.f7938OooO0Oo;
            return i == 0 ? this.f7940OooO0o0 - other.f7940OooO0o0 : i;
        }
    }

    public TableInfo(@NotNull String name, @NotNull Map<String, OooO00o> columns, @NotNull Set<OooO0O0> foreignKeys, @Nullable Set<OooO0o> set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f7922OooO00o = name;
        this.f7923OooO0O0 = columns;
        this.f7924OooO0OO = foreignKeys;
        this.f7925OooO0Oo = set;
    }

    @JvmStatic
    @NotNull
    public static final TableInfo OooO00o(@NotNull SupportSQLiteDatabase supportSQLiteDatabase, @NotNull String tableName) {
        Map mapBuild;
        Set set;
        String str;
        int i;
        int i2;
        Throwable th;
        OooO0o oooO0o;
        SupportSQLiteDatabase database = supportSQLiteDatabase;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(tableName);
        String str2 = "`)";
        sb.append("`)");
        Cursor cursorQuery = database.query(sb.toString());
        try {
            String str3 = "name";
            if (cursorQuery.getColumnCount() <= 0) {
                mapBuild = MapsKt.emptyMap();
                CloseableKt.closeFinally(cursorQuery, null);
            } else {
                int columnIndex = cursorQuery.getColumnIndex("name");
                int columnIndex2 = cursorQuery.getColumnIndex("type");
                int columnIndex3 = cursorQuery.getColumnIndex("notnull");
                int columnIndex4 = cursorQuery.getColumnIndex("pk");
                int columnIndex5 = cursorQuery.getColumnIndex("dflt_value");
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                while (cursorQuery.moveToNext()) {
                    String name = cursorQuery.getString(columnIndex);
                    String type = cursorQuery.getString(columnIndex2);
                    boolean z = cursorQuery.getInt(columnIndex3) != 0;
                    int i3 = cursorQuery.getInt(columnIndex4);
                    String string = cursorQuery.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    Intrinsics.checkNotNullExpressionValue(type, "type");
                    mapCreateMapBuilder.put(name, new OooO00o(i3, 2, name, type, string, z));
                    columnIndex = columnIndex;
                }
                mapBuild = MapsKt.build(mapCreateMapBuilder);
                CloseableKt.closeFinally(cursorQuery, null);
            }
            Cursor cursorQuery2 = database.query("PRAGMA foreign_key_list(`" + tableName + "`)");
            try {
                int columnIndex6 = cursorQuery2.getColumnIndex("id");
                int columnIndex7 = cursorQuery2.getColumnIndex("seq");
                int columnIndex8 = cursorQuery2.getColumnIndex("table");
                int columnIndex9 = cursorQuery2.getColumnIndex("on_delete");
                int columnIndex10 = cursorQuery2.getColumnIndex("on_update");
                int columnIndex11 = cursorQuery2.getColumnIndex("id");
                int columnIndex12 = cursorQuery2.getColumnIndex("seq");
                int columnIndex13 = cursorQuery2.getColumnIndex("from");
                int columnIndex14 = cursorQuery2.getColumnIndex("to");
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                while (cursorQuery2.moveToNext()) {
                    String str4 = str3;
                    int i4 = cursorQuery2.getInt(columnIndex11);
                    int i5 = columnIndex11;
                    int i6 = cursorQuery2.getInt(columnIndex12);
                    int i7 = columnIndex12;
                    String string2 = cursorQuery2.getString(columnIndex13);
                    int i8 = columnIndex13;
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(fromColumnIndex)");
                    String string3 = cursorQuery2.getString(columnIndex14);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(toColumnIndex)");
                    listCreateListBuilder.add(new OooO0OO(i4, i6, string2, string3));
                    mapBuild = mapBuild;
                    str3 = str4;
                    columnIndex11 = i5;
                    columnIndex12 = i7;
                    columnIndex13 = i8;
                    columnIndex14 = columnIndex14;
                }
                Map map = mapBuild;
                String str5 = str3;
                List listSorted = CollectionsKt___CollectionsKt.sorted(CollectionsKt.build(listCreateListBuilder));
                cursorQuery2.moveToPosition(-1);
                Set setCreateSetBuilder = SetsKt.createSetBuilder();
                while (cursorQuery2.moveToNext()) {
                    if (cursorQuery2.getInt(columnIndex7) == 0) {
                        int i9 = cursorQuery2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<OooO0OO> arrayList3 = new ArrayList();
                        for (Object obj : listSorted) {
                            List list = listSorted;
                            if (((OooO0OO) obj).f7938OooO0Oo == i9) {
                                arrayList3.add(obj);
                            }
                            listSorted = list;
                        }
                        List list2 = listSorted;
                        for (OooO0OO oooO0OO : arrayList3) {
                            arrayList.add(oooO0OO.f7939OooO0o);
                            arrayList2.add(oooO0OO.f7941OooO0oO);
                        }
                        String string4 = cursorQuery2.getString(columnIndex8);
                        Intrinsics.checkNotNullExpressionValue(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = cursorQuery2.getString(columnIndex9);
                        Intrinsics.checkNotNullExpressionValue(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = cursorQuery2.getString(columnIndex10);
                        Intrinsics.checkNotNullExpressionValue(string6, "cursor.getString(onUpdateColumnIndex)");
                        setCreateSetBuilder.add(new OooO0O0(string4, string5, string6, arrayList, arrayList2));
                        columnIndex6 = columnIndex6;
                        listSorted = list2;
                    }
                }
                Set setBuild = SetsKt.build(setCreateSetBuilder);
                CloseableKt.closeFinally(cursorQuery2, null);
                Cursor cursorQuery3 = database.query("PRAGMA index_list(`" + tableName + "`)");
                String str6 = str5;
                try {
                    int columnIndex15 = cursorQuery3.getColumnIndex(str6);
                    int columnIndex16 = cursorQuery3.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    int columnIndex17 = cursorQuery3.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        CloseableKt.closeFinally(cursorQuery3, null);
                        set = null;
                    } else {
                        Set setCreateSetBuilder2 = SetsKt.createSetBuilder();
                        while (cursorQuery3.moveToNext()) {
                            if (Intrinsics.areEqual("c", cursorQuery3.getString(columnIndex16))) {
                                String string7 = cursorQuery3.getString(columnIndex15);
                                boolean z2 = cursorQuery3.getInt(columnIndex17) == 1;
                                Intrinsics.checkNotNullExpressionValue(string7, str6);
                                Cursor cursorQuery4 = database.query("PRAGMA index_xinfo(`" + string7 + str2);
                                try {
                                    int columnIndex18 = cursorQuery4.getColumnIndex("seqno");
                                    int columnIndex19 = cursorQuery4.getColumnIndex("cid");
                                    int columnIndex20 = cursorQuery4.getColumnIndex(str6);
                                    int columnIndex21 = cursorQuery4.getColumnIndex("desc");
                                    String str7 = str6;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        str = str2;
                                        i = columnIndex16;
                                        i2 = columnIndex17;
                                        th = null;
                                        CloseableKt.closeFinally(cursorQuery4, null);
                                        oooO0o = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        TreeMap treeMap2 = new TreeMap();
                                        while (cursorQuery4.moveToNext()) {
                                            if (cursorQuery4.getInt(columnIndex19) >= 0) {
                                                int i10 = cursorQuery4.getInt(columnIndex18);
                                                String str8 = str2;
                                                String columnName = cursorQuery4.getString(columnIndex20);
                                                int i11 = columnIndex21;
                                                String str9 = cursorQuery4.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i12 = columnIndex16;
                                                Integer numValueOf = Integer.valueOf(i10);
                                                Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                                                treeMap.put(numValueOf, columnName);
                                                treeMap2.put(Integer.valueOf(i10), str9);
                                                str2 = str8;
                                                columnIndex16 = i12;
                                                columnIndex21 = i11;
                                                columnIndex17 = columnIndex17;
                                            }
                                        }
                                        str = str2;
                                        i = columnIndex16;
                                        i2 = columnIndex17;
                                        Collection collectionValues = treeMap.values();
                                        Intrinsics.checkNotNullExpressionValue(collectionValues, "columnsMap.values");
                                        List list3 = CollectionsKt.toList(collectionValues);
                                        Collection collectionValues2 = treeMap2.values();
                                        Intrinsics.checkNotNullExpressionValue(collectionValues2, "ordersMap.values");
                                        OooO0o oooO0o2 = new OooO0o(string7, z2, list3, CollectionsKt.toList(collectionValues2));
                                        CloseableKt.closeFinally(cursorQuery4, null);
                                        oooO0o = oooO0o2;
                                        th = null;
                                    }
                                    if (oooO0o == null) {
                                        CloseableKt.closeFinally(cursorQuery3, th);
                                        set = null;
                                    } else {
                                        setCreateSetBuilder2.add(oooO0o);
                                        database = supportSQLiteDatabase;
                                        str6 = str7;
                                        columnIndex15 = columnIndex15;
                                        str2 = str;
                                        columnIndex16 = i;
                                        columnIndex17 = i2;
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        CloseableKt.closeFinally(cursorQuery4, th2);
                                        throw th3;
                                    }
                                }
                            }
                        }
                        Set setBuild2 = SetsKt.build(setCreateSetBuilder2);
                        CloseableKt.closeFinally(cursorQuery3, null);
                        set = setBuild2;
                    }
                    return new TableInfo(tableName, map, setBuild, set);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        CloseableKt.closeFinally(cursorQuery3, th4);
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    CloseableKt.closeFinally(cursorQuery2, th6);
                    throw th7;
                }
            }
        } catch (Throwable th8) {
            try {
                throw th8;
            } catch (Throwable th9) {
                CloseableKt.closeFinally(cursorQuery, th8);
                throw th9;
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        Set<OooO0o> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        if (!Intrinsics.areEqual(this.f7922OooO00o, tableInfo.f7922OooO00o) || !Intrinsics.areEqual(this.f7923OooO0O0, tableInfo.f7923OooO0O0) || !Intrinsics.areEqual(this.f7924OooO0OO, tableInfo.f7924OooO0OO)) {
            return false;
        }
        Set<OooO0o> set2 = this.f7925OooO0Oo;
        if (set2 == null || (set = tableInfo.f7925OooO0Oo) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public final int hashCode() {
        return this.f7924OooO0OO.hashCode() + ((this.f7923OooO0O0.hashCode() + (this.f7922OooO00o.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TableInfo{name='" + this.f7922OooO00o + "', columns=" + this.f7923OooO0O0 + ", foreignKeys=" + this.f7924OooO0OO + ", indices=" + this.f7925OooO0Oo + '}';
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        @NotNull
        public final String f7942OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @JvmField
        public final boolean f7943OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @JvmField
        @NotNull
        public final List<String> f7944OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @JvmField
        @NotNull
        public final List<String> f7945OooO0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public OooO0o(@NotNull String name, boolean z, @NotNull List<String> columns, @NotNull List<String> orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.f7942OooO00o = name;
            this.f7943OooO0O0 = z;
            this.f7944OooO0OO = columns;
            this.f7945OooO0Oo = orders;
            if (orders.isEmpty()) {
                int size = columns.size();
                orders = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    orders.add(Index.Order.ASC.name());
                }
            }
            this.f7945OooO0Oo = orders;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            if (this.f7943OooO0O0 != oooO0o.f7943OooO0O0 || !Intrinsics.areEqual(this.f7944OooO0OO, oooO0o.f7944OooO0OO) || !Intrinsics.areEqual(this.f7945OooO0Oo, oooO0o.f7945OooO0Oo)) {
                return false;
            }
            String str = this.f7942OooO00o;
            boolean zOooo00o = StringsKt.Oooo00o(str, "index_");
            String str2 = oooO0o.f7942OooO00o;
            return zOooo00o ? StringsKt.Oooo00o(str2, "index_") : Intrinsics.areEqual(str, str2);
        }

        public final int hashCode() {
            String str = this.f7942OooO00o;
            return this.f7945OooO0Oo.hashCode() + ((this.f7944OooO0OO.hashCode() + ((((StringsKt.Oooo00o(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f7943OooO0O0 ? 1 : 0)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "Index{name='" + this.f7942OooO00o + "', unique=" + this.f7943OooO0O0 + ", columns=" + this.f7944OooO0OO + ", orders=" + this.f7945OooO0Oo + "'}";
        }

        @Deprecated(message = "Use {@link #Index(String, boolean, List, List)}")
        public OooO0o(@NotNull List columns, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            int size = columns.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(Index.Order.ASC.name());
            }
            this(name, false, columns, arrayList);
        }
    }
}
