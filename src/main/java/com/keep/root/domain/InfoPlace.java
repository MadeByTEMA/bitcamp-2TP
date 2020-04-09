package com.keep.root.domain;

import java.sql.Date;
import java.util.List;

public class InfoPlace {
  int no;
  Date startDate;
  Date endDate;
  String placeName;
  String basicAddr;
  String detailAddr;
  List<InfoPhotoFile> infoPhotoFiles;
}