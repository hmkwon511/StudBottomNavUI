package com.example.studbottomnavui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class InsertFragment extends Fragment {

    //DB 객체를 저장하기 위한 멤버필드 추가

    public InsertFragment() {
        // Required empty public constructor
    }

    //학생정보를 DB에 Insert하기 위한 SQL문
    // 1. String sno: 학번 저장
    // 2. String sname: 이름 저장
    // 3. int year: 학년 저장
    // 4. String dept: 학과 저장
    // String SQLStatement = "INSERT INTO STUDENT VALUES (null, '" + sno + "', '" + sname + "'," + year + ",'" + dept + "');";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_insert, container, false);

        //InsertFragment의 레이아웃을 팽창하여 뷰를 생성

        //view에서 학생정보를 입력한 EditText를 인식하여
        //각각 etSno, etSname, etYear, etDept 참조변수에 저장

        //[추가하기] 버튼을 인식하고 OnClickListener 장착
        //버튼을 클릭하면, 학번, 이름, 학년, 학과 정보를 취득하여 DB에 저장
        //다음 입력을 위해 각 EditText를 빈 상태로 변경
    }
}