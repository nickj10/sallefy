import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { ILikeTrack } from 'app/shared/model/like-track.model';

@Component({
  selector: 'jhi-like-track-detail',
  templateUrl: './like-track-detail.component.html'
})
export class LikeTrackDetailComponent implements OnInit {
  likeTrack: ILikeTrack;

  constructor(protected activatedRoute: ActivatedRoute) {}

  ngOnInit() {
    this.activatedRoute.data.subscribe(({ likeTrack }) => {
      this.likeTrack = likeTrack;
    });
  }

  previousState() {
    window.history.back();
  }
}
